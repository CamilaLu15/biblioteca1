package unlar.edu.ar.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {

    private Libro libro;
    private Estudiante estudiante;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    

    public Prestamo() {
    }

    public Prestamo(Libro libro, Estudiante estudiante, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo: [libro = " + libro.getTitulo() + ", estudiante = " + estudiante.getNombre() + ", fecha del Prestamo = " + fechaPrestamo
                + ", fecha de Devolucion = " + fechaDevolucion + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Prestamo prestamo = (Prestamo) obj;
        return Objects.equals(libro.getISBN(), prestamo.libro.getISBN()) &&
                   Objects.equals(estudiante.getLegajo(), prestamo.estudiante.getLegajo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro.getISBN(), estudiante.getLegajo());
    }

    
    
    
}
