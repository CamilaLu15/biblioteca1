package unlar.edu.ar.Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

}
