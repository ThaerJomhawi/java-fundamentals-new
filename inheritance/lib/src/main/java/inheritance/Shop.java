package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    String name;
    int rate;
    String priceRate;
    private List<Review> reviews;

    Shop (String name, int rate, String price){
        this.name = name;
        this.rate = rate;
        this.priceRate = price;
        this.reviews = new ArrayList<Review>();
    }
}
