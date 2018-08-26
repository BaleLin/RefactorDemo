package rentalstore;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public class Statement {
    public  String statement(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customer.rentals.elements();
        String result = getHeadString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //add frequent renter points
            frequentRenterPoints = each.getFrequentRenterPoints();
            //show figures for this rental
            result += getEachRentalString(each);
            totalAmount += each.getCharge();
        }
        //add footer lines
        result += getFootString(totalAmount,frequentRenterPoints);
        return result;
    }
    private String getEachRentalString(Rental each) {
        return "movice title:" + each.getMovie().getTitle()
                + ","
                + "this movice amount:"
                + String.valueOf(each.getCharge())
                + "\n";
    }

    public String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName()
                + "\n";
    }
    public String getFootString(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalAmount)
                + "\n"
                +"You earned "
                + String.valueOf(frequentRenterPoints)
                + " frequent renter points"
                + "\n";
    }
}
