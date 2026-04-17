package unlar.edu.ar;

import unlar.edu.ar.Sistema.SistemaBiblioteca;
import unlar.edu.ar.Modelo.*;
import unlar.edu.ar.Excepciones.*;

public class App {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        
        // Aqui creamos los 5 libros
        sistema.agregarLibro(new Libro("101", "Matematica I", "Autor A", 2020, true, 1500.0));
        sistema.agregarLibro(new Libro("102", "Fisica I", "Autor B", 2023, true, 3000.0));
        sistema.agregarLibro(new Libro("103", "Programacion I", "Autor C", 2024, true, 4500.0));
        sistema.agregarLibro(new Libro("104", "Algebra", "Autor D", 2022, true, 2800.0));
        sistema.agregarLibro(new Libro("105", "Sistemas", "Autor E", 2024, true, 3500.0));

        // Aqui creamos 3 estudiantes
        sistema.agregarEstudiante(new Estudiante("2001", "Juan Perez", "Sistemas", "juan@u.edu.ar"));
        sistema.agregarEstudiante(new Estudiante("2002", "Maria Lopez", "Sistemas", "maria@u.edu.ar"));
        sistema.agregarEstudiante(new Estudiante("2003", "Lucas Garcia", "Industrial", "lucas@u.edu.ar"));

        System.out.println("--- Ejecutando pruebas del sistema ---\n");

        
        try {
            System.out.println("Intentando prestar 'Matematica I' a Juan");
            sistema.registrarPrestamo("2001", "101");
            System.out.println("Resultado: Prestamo realizado con éxito.\n");

            System.out.println("Intentando prestar el mismo libro a Maria (deberia fallar)...");
            sistema.registrarPrestamo("2002", "101"); 

        } catch (LibroNoDisponibleException e) {
            System.out.println("Excepcion capturada: " + e.getMessage() + "\n");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        
        // Calculamos multa para 15 días con un libro de valor $2000
        double valorLibro = 2000.0;
        int dias = 15;
        double multaTotal = sistema.calcularMulta(dias, valorLibro);

        System.out.println("--- Prueba de calculo de la multa ---");
        System.out.println("Dias de retraso: " + dias);
        System.out.println("Monto de multa a pagar: $" + multaTotal);
        
        System.out.println("\n--- LISTADO DE PRESTAMOS ---");
        sistema.listarPrestamos("2001");
    }
}
