package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    Review(String body,String author,int rate){
        this.author = author;
        this.body = body;
        this.stars = rate;
    }

    @Override
    public String toString() {
        return "Author Name: "+this.author+" said: "+this.body+" and his rate was: "+this.stars;
    }

}