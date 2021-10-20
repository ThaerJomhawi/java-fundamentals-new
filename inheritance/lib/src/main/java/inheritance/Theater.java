package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    String name;
    int rate;
    String nowMovie;
    private List<Review> reviews;

    Theater (String name, int rate, String movie){
        this.name = name;
        this.rate = rate;
        this.nowMovie = movie;
        this.reviews = new ArrayList<Review>();
    }


    public void addMovie(String movieName) {

    }

    public void removeMovie(String movieName) {

    }
}
