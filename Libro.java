package biblioteca;

public class Libro {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean disponible = true;

    public Libro(String titulo, String autor, String isbn) {
        if (isbn == null) {
            throw new IllegalArgumentException("El ISBN no puede ser null");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ", ISBN " + isbn + ")";
    }
}
