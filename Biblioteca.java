package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona una biblioteca sencilla: un catálogo de libros y una lista de socios.
 * Permite añadir libros y socios, buscar libros por título y registrar préstamos.
 *
 * @author Luiggi
 * @version 1.0
 * @since 1.0
 * @see Libro
 * @see Socio
 */
public class Biblioteca {

    private final List<Libro> catalogo = new ArrayList<>();
    private final List<Socio> socios = new ArrayList<>();

    /**
     * Añade un libro al catálogo.
     *
     * @param libro el libro que se añade
     * @throws IllegalArgumentException si el libro es null
     */
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser null");
        }
        catalogo.add(libro);
    }

    /**
     * Añade un socio a la biblioteca.
     *
     * @param socio el socio que se añade
     * @throws IllegalArgumentException si el socio es null
     */
    public void agregarSocio(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("El socio no puede ser null");
        }
        socios.add(socio);
    }

    /**
     * Busca libros cuyo título contenga el texto indicado.
     * No distingue entre mayúsculas y minúsculas, y basta con que el texto
     * aparezca en cualquier parte del título.
     *
     * @param texto texto que se busca dentro del título
     * @return lista con los libros encontrados, vacía si no hay ninguno
     */
    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    /**
     * Busca libros por título. Es el método antiguo.
     *
     * @param titulo texto que se busca dentro del título
     * @return lista con los libros encontrados
     * @deprecated Sustituido por {@link #buscarPorTitulo(String)}, que hace lo mismo.
     */
    @Deprecated
    public List<Libro> buscar(String titulo) {
        return buscarPorTitulo(titulo);
    }

    /**
     * Presta un libro a un socio.
     * Comprueba con {@link Libro#isDisponible()} que el libro está libre.
     * Si lo está, lo marca como no disponible y lo apunta en la lista del socio
     * con {@link Socio#prestar(Libro)}.
     *
     * @param socio el socio que se lleva el libro
     * @param libro el libro que se presta
     * @throws LibroNoDisponibleException si el libro ya está prestado
     */
    public void registrarPrestamo(Socio socio, Libro libro)
            throws LibroNoDisponibleException {
        if (!libro.isDisponible()) {
            throw new LibroNoDisponibleException(libro.getTitulo());
        }
        libro.setDisponible(false);
        socio.prestar(libro);
    }
}
