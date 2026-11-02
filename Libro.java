package biblioteca;

/**
 * Representa un libro de la biblioteca.
 * Guarda el título, el autor, el ISBN y si está disponible para prestar.
 *
 * @see Socio
 */
public class Libro {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean disponible = true;

    /**
     * Crea un libro nuevo. Empieza siendo disponible.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param isbn código ISBN del libro
     * @throws IllegalArgumentException si el ISBN es null
     */
    public Libro(String titulo, String autor, String isbn) {
        if (isbn == null) {
            throw new IllegalArgumentException("El ISBN no puede ser null");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return el título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return el autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el ISBN del libro.
     *
     * @return el código ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Indica si el libro se puede prestar ahora.
     *
     * @return {@code true} si está disponible, {@code false} si está prestado
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Cambia la disponibilidad del libro.
     * Lo usa {@link Biblioteca#registrarPrestamo(Socio, Libro)} al prestarlo.
     * Para consultarla se usa {@link #isDisponible()}.
     *
     * @param disponible {@code true} si el libro queda disponible, {@code false} si no
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ", ISBN " + isbn + ")";
    }
}
