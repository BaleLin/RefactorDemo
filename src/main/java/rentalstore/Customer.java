package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public Vector getRentals() {
        return rentals;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){

            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.getThisAmount();

            //add frequent renter points
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, each);

            //show figures for this rental
            result += "movice title:"+each.getMovie().getTitle() + "," + "this movice amount:"+String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points"+ "\n";
        return result;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        frequentRenterPoints ++;
        //add bonus for a two day new release rental
        if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }


}
