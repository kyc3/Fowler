package fowler;

public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		 // add bonus for a two day new release rental
		return 1;
	}
}
