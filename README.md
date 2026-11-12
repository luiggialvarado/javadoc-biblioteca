# javadoc-biblioteca

Ejercicio de Java sobre documentar código con Javadoc: una biblioteca sencilla con libros y socios, con todos los métodos documentados y la documentación en HTML ya generada. Ejercicio del curso de Desarrollo Web Full Stack.

## Qué hay en el repo
- `Biblioteca.java`: catálogo de libros, lista de socios y préstamos
- `Libro.java`: título, autor, ISBN y si está disponible
- `Socio.java`: nombre, número de socio y libros que tiene prestados
- `LibroNoDisponibleException.java`: error que se lanza al prestar un libro que ya está prestado
- `doc/`: la documentación generada con Javadoc

## Qué hace el código
- Añadir libros y socios (si se pasa `null` lanza `IllegalArgumentException`)
- Buscar libros por título, sin distinguir mayúsculas y minúsculas
- Registrar un préstamo: si el libro ya está prestado lanza `LibroNoDisponibleException`; si no, lo marca como no disponible y lo apunta en la lista del socio
- `buscar` es el método antiguo y está marcado como `@Deprecated`; se usa `buscarPorTitulo`

No tiene método `main`: son clases pensadas para usarlas desde otro programa.

## Qué se practica con Javadoc
Comentarios de documentación con las etiquetas `@param`, `@return`, `@throws`, `@see`, `@deprecated`, `@author`, `@version` y `@since`, y enlaces entre clases con `{@link ...}`.

## Cómo ver la documentación
GitHub no muestra los archivos HTML ya renderizados. Descarga el repo (botón verde **Code** y luego **Download ZIP**) y abre `doc/index.html` en el navegador.
