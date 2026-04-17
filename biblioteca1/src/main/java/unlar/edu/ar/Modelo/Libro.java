package unlar.edu.ar.Modelo;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;
    private double precio;

    
    public Libro(){
        
    }

    public Libro(String ISBN, String titulo, String autor, int anio, boolean disponible, double precio){

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Libro: "+ titulo + "su ISBN = " + ISBN + ", autor = " + autor + ", año = " + anio + ", disponible = "
                + disponible + "]";
    }
}
