package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;
    private MovieType movieType;
    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Rental(Movie movie, int dayRented, MovieType movieType) {
        this.movie = movie;
        this.dayRented = dayRented;
        this.movieType = movieType;
    }

    public double getCharge() {
        double thisAmount =0;
        switch (this.getMovie().getPriceCode()){
            case Movie.REGULAR:
                thisAmount += 2;
                if(this.getDayRented() > 2){
                    thisAmount+=(this.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount+=this.getDayRented()*3;
                break;
            case Movie.CHILDRENS:
                thisAmount+=1.5;
                if(this.getDayRented() > 3){
                    thisAmount += (this.getDayRented() -3)*1.5;
                }
                break;
        }
        return thisAmount;
    }
    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;
        //add bonus for a two day new release rental
        if((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }
    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }
}
