package rentalstore;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public abstract class Statement {
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
    protected abstract String getEachRentalString(Rental each);
    protected abstract String getHeadString(Customer customer);
    protected abstract String getFootString(double totalAmount, int frequentRenterPoints);
}
