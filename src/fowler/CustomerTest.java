package fowler;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {

	final String name = "Yannick Winter";
	Customer customer = new Customer(name);
    Movie m = new Movie("Movie", 1);
    Rental r = new Rental(m, 30);

    @Test
    public void addRental() throws Exception {
        customer.addRental(r);
        assertEquals(customer.statement(), "Rental Record for Yannick Winter\n\tTitle\t\tDays\tAmount\n\tMovie\t90.0\nAmount owed is 90.0\nYou earned 2 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), name);
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(r);
        assertEquals(customer.statement(), "Rental Record for Yannick Winter\n\tTitle\t\tDays\tAmount\n\tMovie\t90.0\nAmount owed is 90.0\nYou earned 2 frequent renter points");
    }

	
}
