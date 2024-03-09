import java.util.*;

public class main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Mostrar información de un empleado");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el apellido del empleado:");
                    String apellido = scanner.next();
                    Employee empleado = new Employee(nombre, apellido);
                    System.out.println("¿Cuántas cuentas desea agregar?");
                    int numCuentas = scanner.nextInt();
                    for (int i = 0; i < numCuentas; i++) {
                        System.out.println("Ingrese el número de cuenta:");
                        long numCuenta = scanner.nextLong();
                        System.out.println("Ingrese el tipo de cuenta (A, B, C):");
                        char tipoCuenta = scanner.next().charAt(0);
                        empleado.addAccount(new BankAccount(numCuenta, tipoCuenta));
                    }
                    banco.addEmployee(empleado);
                    break;
                case 2:
                    banco.listarEmpleados();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombreBuscar = scanner.next();
                    System.out.println("Ingrese el apellido del empleado:");
                    String apellidoBuscar = scanner.next();
                    banco.mostrarEmpleado(nombreBuscar, apellidoBuscar);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}