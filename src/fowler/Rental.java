package fowler;

class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    public double getCharge() {
    	return this.getMovie().getCharge(this.getDaysRented());
	}
    
    public int getFrequentRenterPoints() {
		 // add bonus for a two day new release rental
		return this.getMovie().getFrequentRenterPoints(this.getDaysRented());
	}
    
}