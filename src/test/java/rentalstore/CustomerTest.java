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
    public void should_print_right_message_when_given_CHILDRENS_movice_and_2_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,2);
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:childrenMovice,this movice amount:1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points\n",customer.statement());

    }

    @Test
    public void should_print_right_message_when_given_CHILDRENS_movice_and_4_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,4);
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:childrenMovice,this movice amount:3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points\n",customer.statement());

    }

    @Test
    public void should_print_right_message_when_given_REGULAR_movice_and_2_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,2);
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:Romance of the Three Kingdoms,this movice amount:2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points\n",customer.statement());

    }

    @Test
    public void should_print_right_message_when_given_REGULAR_movice_and_3_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,3);
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:Romance of the Three Kingdoms,this movice amount:3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points\n",customer.statement());

    }

}
