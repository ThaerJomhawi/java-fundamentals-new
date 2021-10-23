package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    String movieName = "";

    Review(String body,String author,int rate){
        this.author = author;
        this.body = body;
        this.stars = rate;
    }

    Review(String body,String author,int rate , String movie){
        this.author = author;
        this.body = body;
        this.stars = rate;
        this.movieName = movie;
    }

    @Override
    public String toString() {
        return "Author Name: "+this.author+" said: "+this.body+" and his rate was: "+this.stars;
    }

}