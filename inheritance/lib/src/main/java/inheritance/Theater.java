package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    String name;
    int rate;
    List<String> movies;
    private List<Review> reviews;

    Theater (String name, int rate){
        this.name = name;
        this.rate = rate;
        this.movies = new ArrayList<String>();
        this.reviews = new ArrayList<Review>();
    }

    @Override
    public String toString() {
        return "Theater Name: "+this.name+" with rate: "+this.rate;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    void addReview(Review review){
        this.reviews.add(review);
        int s = 0;
        for(Review r:this.reviews){
            s += r.stars;
        }
        this.rate = s/this.reviews.size();
    }
}
