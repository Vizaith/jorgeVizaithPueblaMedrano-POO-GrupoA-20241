import java.util.*;
public class Banco {
    private ArrayList<Employee> employees;

    public Banco() {
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listarEmpleados() {
        for (Employee employee : employees) {
            System.out.println("Nombre: " + employee.getName() + " " + employee.getLastName());
            for (BankAccount account : employee.getAccounts()) {
                System.out.println("Cuenta: " + account.getAccountNumber() + " - Tipo: " + account.getType());
            }
            System.out.println("");
        }
    }

    public void mostrarEmpleado(String name, String lastName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name) && employee.getLastName().equals(lastName)) {
                System.out.println("Nombre: " + employee.getName() + " " + employee.getLastName());
                for (BankAccount account : employee.getAccounts()) {
                    System.out.println("Cuenta: " + account.getAccountNumber() + " - Tipo: " + account.getType());
                }
                return;
            }
        }
        System.out.println("Empleado no encontrado");
    }
}
