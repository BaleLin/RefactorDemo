package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_add_successfully_when_given_a_rental(){

        Movie movie = new Movie("movice",2);
        Rental rental = new Rental(movie,2);
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals(rental,customer.getRentals().get(0));
    }

    @Test
    public void should_print_right_message_when_given_CHILDRENS_movice_and_2_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,2,new ChildrensMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:childrenMovice,this movice amount:1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1.0 frequent renter points\n", customer.getTxtStatement(customer));

    }

    @Test
    public void should_print_right_message_when_given_CHILDRENS_movice_and_4_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,4,new ChildrensMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:childrenMovice,this movice amount:3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points\n", customer.getTxtStatement(customer));

    }

    @Test
    public void should_print_right_message_when_given_REGULAR_movice_and_2_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,2,new RegularMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:Romance of the Three Kingdoms,this movice amount:2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1.0 frequent renter points\n", customer.getTxtStatement(customer));

    }

    @Test
    public void should_print_right_message_when_given_REGULAR_movice_and_3_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,3,new RegularMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:Romance of the Three Kingdoms,this movice amount:3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1.0 frequent renter points\n", customer.getTxtStatement(customer));

    }
    @Test
    public void should_print_right_message_when_given_NEW_RELEASE_movice_and_3_dayRented(){

        Movie movie = new Movie("Love apartment",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,3,new NewReleaseMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("Rental Record for Jhon\n" +
                "movice title:Love apartment,this movice amount:9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2.0 frequent renter points\n", customer.getTxtStatement(customer));
    }

    @Test
    public void should_print_right_Htmlmessage_when_given_CHILDRENS_movice_and_2_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,2,new ChildrensMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "childrenMovice: 1.5<BR>\n" +
                "<P>You owe<EM>1.5</EM><p>\n" +
                "On this rental you earned <EM>1.0</EM> frequent renter points<P>", customer.getHtmlStatement(customer));

    }

    @Test
    public void should_print_right_Htmlmessage_when_given_CHILDRENS_movice_and_4_dayRented(){

        Movie movie = new Movie("childrenMovice",Movie.CHILDRENS);
        Rental rental = new Rental(movie,4,new ChildrensMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "childrenMovice: 3.0<BR>\n" +
                "<P>You owe<EM>3.0</EM><p>\n" +
                "On this rental you earned <EM>1.0</EM> frequent renter points<P>", customer.getHtmlStatement(customer));

    }

    @Test
    public void should_print_right_Htmlmessage_when_given_REGULAR_movice_and_2_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,2,new RegularMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "Romance of the Three Kingdoms: 2.0<BR>\n" +
                "<P>You owe<EM>2.0</EM><p>\n" +
                "On this rental you earned <EM>1.0</EM> frequent renter points<P>", customer.getHtmlStatement(customer));

    }

    @Test
    public void should_print_right_Htmlmessage_when_given_REGULAR_movice_and_3_dayRented(){

        Movie movie = new Movie("Romance of the Three Kingdoms",Movie.REGULAR);
        Rental rental = new Rental(movie,3,new RegularMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "Romance of the Three Kingdoms: 3.5<BR>\n" +
                "<P>You owe<EM>3.5</EM><p>\n" +
                "On this rental you earned <EM>1.0</EM> frequent renter points<P>", customer.getHtmlStatement(customer));

    }
    @Test
    public void should_print_right_Htmlmessage_when_given_NEW_RELEASE_movice_and_3_dayRented(){

        Movie movie = new Movie("Love apartment",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,3,new NewReleaseMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "Love apartment: 9.0<BR>\n" +
                "<P>You owe<EM>9.0</EM><p>\n" +
                "On this rental you earned <EM>2.0</EM> frequent renter points<P>", customer.getHtmlStatement(customer));
    }

    @Test
    public void should_print_right_Htmlmessage_when_given_Art_movice(){

        Movie movie = new Movie("Love",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,3,new ArtMovie());
        Customer customer = new Customer("Jhon");

        customer.addRental(rental);

        assertEquals("<H1>Rentals for <EM>Jhon</EM></H1><P>\n" +
                "Love: 6.0<BR>\n" +
                "<P>You owe<EM>6.0</EM><p>\n" +
                "On this rental you earned <EM>1.5</EM> frequent renter points<P>", customer.getHtmlStatement(customer));
    }

}
