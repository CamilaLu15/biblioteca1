package unlar.edu.ar.Modelo;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    public Libro(){
        
    }

    public Libro(String ISBN, String titulo, String autor, int anio, boolean disponible){

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }


    @Override
    public String toString() {
        return "Libro [ISBN = " + ISBN + ", titulo = " + titulo + ", autor = " + autor + ", anio = " + anio + ", disponible = "
                + disponible + "]";
    }
}
