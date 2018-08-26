package rentalstore;

public  class TxtStatement extends Statement{
    protected String getEachRentalString(Rental each) {
        return "movice title:" + each.getMovie().getTitle()
                + ","
                + "this movice amount:"
                + String.valueOf(each.getCharge())
                + "\n";
    }

    protected String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName()
                + "\n";
    }
    protected String getFootString(double totalAmount, double frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalAmount)
                + "\n"
                +"You earned "
                + String.valueOf(frequentRenterPoints)
                + " frequent renter points"
                + "\n";
    }
}
