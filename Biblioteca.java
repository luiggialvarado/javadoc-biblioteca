package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Libro> catalogo = new ArrayList<>();
    private final List<Socio> socios = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser null");
        }
        catalogo.add(libro);
    }

    public void agregarSocio(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("El socio no puede ser null");
        }
        socios.add(socio);
    }

    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    // Método antiguo, sustituido por buscarPorTitulo(String)
    public List<Libro> buscar(String titulo) {
        return buscarPorTitulo(titulo);
    }

    public void registrarPrestamo(Socio socio, Libro libro)
            throws LibroNoDisponibleException {
        if (!libro.isDisponible()) {
            throw new LibroNoDisponibleException(libro.getTitulo());
        }
        libro.setDisponible(false);
        socio.prestar(libro);
    }
}
