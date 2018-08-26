package rentalstore;

public class RegularMovie extends MovieType {
    protected double getCharge(int dayRented) {
        double thisAmount = 2.0;
        if(dayRented > 2){
            thisAmount += (dayRented -2)*1.5;
        }
        return thisAmount;
    }
}
