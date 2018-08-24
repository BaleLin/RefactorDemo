package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_add_successfully_when_given_a_rental(){

        Movie movie = new Movie("movice",2);
        Rental rental = new Rental(movie,2);
        Customer customer = new Customer("小明");

        customer.addRental(rental);

        assertEquals(rental,customer.getRentals().get(0));
    }

    @Test
    public void should_print_right_message_when_given_a_rental(){

        Movie movie = new Movie("movice",2);
        Rental rental = new Rental(movie,2);
        Customer customer = new Customer("小明");

        customer.addRental(rental);

        assertEquals("Rental Record for 小明\n" +
                "\tmovice\t1.5\n" +
                "Amount owed is1.5\n" +
                "You earned1 frequent renter points",customer.statement());

    }
}
