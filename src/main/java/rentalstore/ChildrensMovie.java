package rentalstore;

public class ChildrensMovie extends MovieType {
    protected double getCharge(int dayRented) {
        double thisAmount = 1.5;
        if(dayRented > 3){
            thisAmount += (dayRented -3)*1.5;
        }
        return thisAmount;
    }
}
