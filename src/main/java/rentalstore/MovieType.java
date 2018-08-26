package rentalstore;

public abstract class MovieType {
    protected abstract double getCharge(int dayRented);
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
