package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    int rate;
    String priceRate;
    private List<Review> reviews;

    Restaurant(String name, int rate, String price){
        this.name = name;
        this.rate = rate;
        this.priceRate = price;
        this.reviews = new ArrayList<Review>();
    }

    @Override
    public String toString() {
        return "Restaurant Name: "+this.name+" with rate: "+this.rate+" and price category: "+this.priceRate;
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