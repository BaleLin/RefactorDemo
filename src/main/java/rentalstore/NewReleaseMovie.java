package rentalstore;

public class NewReleaseMovie extends MovieType {
    protected double getCharge(int dayRented) {
        return dayRented * 3.0;
    }
    public int getFrequentRenterPoints(int dayRented) {
       if (dayRented>1)
        return 2;
       return 1;
    }
}
