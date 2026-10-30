package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Socio {

    private final String nombre;
    private final int numeroSocio;
    private final List<Libro> prestados = new ArrayList<>();

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public List<Libro> getPrestados() {
        return new ArrayList<>(prestados);
    }

    public void prestar(Libro libro) {
        prestados.add(libro);
    }

    public void devolver(Libro libro) {
        prestados.remove(libro);
    }
}
