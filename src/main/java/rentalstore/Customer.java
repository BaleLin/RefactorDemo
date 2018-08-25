package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

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

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = getHeadString();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //add frequent renter points
            frequentRenterPoints = each.getFrequentRenterPoints();
            //show figures for this rental
            result += getEachString(each);
            totalAmount += each.getThisAmount();
        }
        //add footer lines
        result += getFootString(totalAmount,frequentRenterPoints);
        return result;
    }

    private String getEachString(Rental each) {
        return "movice title:" + each.getMovie().getTitle()
                               + ","
                               + "this movice amount:"
                               + String.valueOf(each.getThisAmount())
                               + "\n";
    }

    private String getHeadString() {
        return "Rental Record for " + getName()
                                    + "\n";
    }
    private String getFootString(double totalAmount,int frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalAmount)
                                 + "\n"
                                 +"You earned "
                                 + String.valueOf(frequentRenterPoints)
                                 + " frequent renter points"
                                 + "\n";
    }




}
