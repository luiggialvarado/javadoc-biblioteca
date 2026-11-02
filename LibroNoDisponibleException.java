package biblioteca;

/**
 * Excepción que se lanza al intentar prestar un libro que no está disponible.
 *
 * @see Biblioteca#registrarPrestamo(Socio, Libro)
 */
public class LibroNoDisponibleException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Crea la excepción con un mensaje que incluye el título del libro.
     *
     * @param titulo título del libro que no está disponible
     */
    public LibroNoDisponibleException(String titulo) {
        super("El libro '" + titulo + "' no está disponible");
    }
}