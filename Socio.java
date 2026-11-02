package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un socio de la biblioteca.
 * Guarda su nombre, su número de socio y la lista de libros que tiene prestados.
 *
 * @see Libro
 */
public class Socio {

    private final String nombre;
    private final int numeroSocio;
    private final List<Libro> prestados = new ArrayList<>();

    /**
     * Crea un socio nuevo, sin libros prestados.
     *
     * @param nombre nombre del socio
     * @param numeroSocio número que identifica al socio
     */
    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    /**
     * Devuelve el nombre del socio.
     *
     * @return el nombre del socio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de socio.
     *
     * @return el número que identifica al socio
     */
    public int getNumeroSocio() {
        return numeroSocio;
    }

    /**
     * Devuelve los libros que el socio tiene prestados.
     * La lista es una copia, así que modificarla no cambia la del socio.
     *
     * @return una copia de la lista de libros prestados
     */
    public List<Libro> getPrestados() {
        return new ArrayList<>(prestados);
    }

    /**
     * Añade un libro a la lista de prestados del socio.
     * Solo apunta el libro en el socio, no cambia su disponibilidad.
     * Para devolverlo se usa {@link #devolver(Libro)}.
     *
     * @param libro el libro que se presta
     */
    public void prestar(Libro libro) {
        prestados.add(libro);
    }

    /**
     * Quita un libro de la lista de prestados del socio.
     * No cambia la disponibilidad del libro. Es la operación contraria
     * a {@link #prestar(Libro)}.
     *
     * @param libro el libro que se devuelve
     */
    public void devolver(Libro libro) {
        prestados.remove(libro);
    }
}