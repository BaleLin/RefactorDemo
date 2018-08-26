package rentalstore;

public abstract class MovieType {
    protected abstract double getCharge(int dayRented);
    public double getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
