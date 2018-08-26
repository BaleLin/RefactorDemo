package rentalstore;

public class HtmlStatement extends Statement{
    protected  String getEachRentalString(Rental each){
        return each.getMovie().getTitle()
                + ": "
                + String.valueOf(each.getCharge())
                + "<BR>\n";
    }

    protected  String getHeadString(Customer customer){
        return "<H1>Rentals for <EM>"
                + customer.getName()
                + "</EM></H1><P>\n";
    }
    protected  String getFootString(double totalAmount, double frequentRenterPoints){
        return "<P>You owe<EM>"
                + String.valueOf(totalAmount)
                + "</EM><p>\n"
                + "On this rental you earned <EM>"
                + String.valueOf(frequentRenterPoints)
                + "</EM> frequent renter points<P>";
    }
}
