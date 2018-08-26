package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    public Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public Vector getRentals() {
        return rentals;
    }
    public String statement(Customer customer){
        return new TxtStatement().statement(customer);
    }
}
