import java.util.*;
public class main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar libro");
            System.out.println("3. Rentar libro");
            System.out.println("4. Listar usuarios existentes");
            System.out.println("5. Listar libros existentes");
            System.out.println("6. Listar usuarios con libros");
            System.out.println("7. Listar libros no rentados");
            System.out.println("8. Listar libros rentados");
            System.out.println("9. Salir");
            System.out.println("Ingrese la opción que busca:");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del usuario:");
                    String nombreUsuario = scanner.nextLine();
                    System.out.println("Ingrese ID del usuario:");
                    int idUsuario = scanner.nextInt();
                    Usuario usuario = new Usuario(nombreUsuario, idUsuario);
                    libreria.añadirUsuario(usuario);
                    break;
                case 2:
                    System.out.println("Ingrese titulo del libro:");
                    String tituloLibro = scanner.nextLine();
                    System.out.println("Ingrese autor del libro:");
                    String autorLibro = scanner.nextLine();
                    System.out.println("Ingrese ID del libro:");
                    int idLibro = scanner.nextInt();
                    Libro libro = new Libro(tituloLibro, autorLibro, idLibro);
                    libreria.añadirLibro(libro);
                    break;
                case 3:
                    System.out.println("Ingrese ID del usuario que renta el libro:");
                    int idUsuarioRenta = scanner.nextInt();
                    System.out.println("Ingrese ID del libro a rentar:");
                    int idLibroRenta = scanner.nextInt();
                    Usuario usuarioRenta = libreria.usuarios.stream().filter(u -> u.getId() == idUsuarioRenta).findFirst().orElse(null);
                    Libro libroRenta = libreria.libros.stream().filter(l -> l.getId() == idLibroRenta).findFirst().orElse(null);
                    if (usuarioRenta != null && libroRenta != null) {
                        libreria.rentarLibro(usuarioRenta, libroRenta);
                    } else {
                        System.out.println("Usuario o libro no existente");
                    }
                    break;
                case 4:
                    libreria.listarUsuarios();
                    break;
                case 5:
                    libreria.listarLibros();
                    break;
                case 6:
                    libreria.listarUsuariosConLibros();
                    break;
                case 7:
                    libreria.listarLibrosNoRentados();
                    break;
                case 8:
                    libreria.listarLibrosRentados();
                    break;
                case 9:
                    System.out.println("Usted ha decidido salir :)");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 9);
        
        scanner.close();
    }
}