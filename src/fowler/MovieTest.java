package fowler;

import org.junit.Test;

import static org.junit.Assert.*;


public class MovieTest {

    Movie movie = new Movie("Movie", 1905);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 1905);
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(15);
        assertEquals(movie.getPriceCode(), 15);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(), "Movie");
    }

}