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
        return movieType.getCharge(dayRented);
    }
    public double getFrequentRenterPoints() {
        return movieType.getFrequentRenterPoints(dayRented);
    }
    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }
}
