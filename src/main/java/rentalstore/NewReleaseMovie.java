package rentalstore;

public class NewReleaseMovie extends MovieType {
    protected double getCharge(int dayRented) {
        return dayRented * 3.0;
    }
}
