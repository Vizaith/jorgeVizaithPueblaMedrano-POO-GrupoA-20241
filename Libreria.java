import java.util.*;
class Libreria {

    List<Usuario> usuarios;
    List<Libro> libros;
    
    public Libreria() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
    }
    
    public void añadirUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }
    
    public void rentarLibro(Usuario usuario, Libro libro) {
        libro.setRentado(true);
        System.out.println("El libro: " + libro.getTitulo() + " fue rentado por: " + usuario.getNombre());
    }
    
    public void listarUsuarios() {
        System.out.println("Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre());
        }
    }
    
    public void listarLibros() {
        System.out.println("Libros:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }
    
    public void listarUsuariosConLibros() {
        System.out.println("Usuarios que han rentado por lo menos un libro:");
        for (Usuario usuario : usuarios) {
            for (Libro libro : libros) {
                if (libro.isRentado()) {
                    System.out.println(usuario.getNombre());
                    break;
                }
            }
        }
    }
    
    public void listarLibrosNoRentados() {
        System.out.println("Libros no rentados: ");
        for (Libro libro : libros) {
            if (!libro.isRentado()) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }
    
    public void listarLibrosRentados() {
        System.out.println("Libros rentados:");
        for (Libro libro : libros) {
            if (libro.isRentado()) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }
}