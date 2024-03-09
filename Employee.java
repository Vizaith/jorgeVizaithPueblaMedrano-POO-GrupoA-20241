import java.util.*;
public class Employee {
    private String name;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
}
