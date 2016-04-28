package fowler;

import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    Movie m = new Movie("Movie", 15);
    Rental r = new Rental(m, 110);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(r.getDaysRented(), 110);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(r.getMovie(), m);
    }

}