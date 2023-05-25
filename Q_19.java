// Implementing “Multiple Inheritance”. Create a two interfaces Account containing methods set() and display() And interface Person containing methods store() and disp(). Derive a class Customer from Person and Account. Accept the name, account number, balance and display all the information related to account along with the interest. 
interface Account {
    void set(String accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + (balance * 0.05));
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John Doe");
        customer.set("123456", 5000.0);
        customer.disp();
        customer.display();
    }
}
