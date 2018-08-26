package rentalstore;

public class ArtMovie extends MovieType{
    protected double getCharge(int dayRented) {
        return 6.0;
    }
    public double getFrequentRenterPoints(int dayRented) {
        return 1.5;
    }
}
