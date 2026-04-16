package unlar.edu.ar.Sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


import unlar.edu.ar.Excepciones.EstudianteNoEncontradoException;
import unlar.edu.ar.Excepciones.LibroNoDisponibleException;
import unlar.edu.ar.Excepciones.LimitePrestamosExcedidoException;
import unlar.edu.ar.Modelo.Estudiante;
import unlar.edu.ar.Modelo.Libro;
import unlar.edu.ar.Modelo.Prestamo;

public class SistemaBiblioteca {

    private ArrayList<Libro> catalogo;
    private HashMap<String, Estudiante> estudiantes;
    private HashSet<Prestamo> prestamosActivos;
    
    
    public SistemaBiblioteca() {
        // Inicializo las colecciones vacias para que luego no den errores

        this.catalogo = new ArrayList<>();
        this.estudiantes = new HashMap<>();
        this.prestamosActivos = new HashSet<>();
    }
    public void registrarPrestamo(String legajo, String isbn)
    throws EstudianteNoEncontradoException, LibroNoDisponibleException, LimitePrestamosExcedidoException {

        Estudiante est= estudiantes.get(legajo);
        if (est == null) throw new EstudianteNoEncontradoException("Legajo no encontrado: " + legajo);

        long count = prestamosActivos.stream()
        .filter(p -> p.getEstudiante().getLegajo().equals(legajo))
        .count();
        if(count >= 3) throw new LimitePrestamosExcedidoException("El estudiante ya tiene el maximo de 3 libros");

        Libro libro = catalogo.stream()
        .filter (l -> l.getISBN().equals(isbn))
        .findFirst()
        .orElse(null);
    
        if (libro == null || !libro.isDisponible()) {
            throw new LibroNoDisponibleException("Libro no disponible o inexistente");
            
        }
        libro.setDisponible(false);
        Prestamo nuevo = new Prestamo(libro,est,LocalDate.now(),null);
        prestamosActivos.add(nuevo);
       
    }
    public double calcularMulta(int diasRetraso, double valorLibro){
        if (diasRetraso <= 0) return 0;
        if (diasRetraso > 30) diasRetraso = 30;
        return (valorLibro * 0.01) + calcularMulta(diasRetraso - 1, valorLibro);
    }

    public void agregarLibro (Libro libro) {catalogo.add(libro);}
    public void agregarEstudiante (Estudiante e) {estudiantes.put(e.getLegajo(),e);}

}
