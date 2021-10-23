/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("emprore ",4,"$$");
        Review rev1 = new Review("Good" , "saif", 5);
        Review rev2 = new Review("great" , "belal", 5);
        Review rev3 = new Review("Not Good" , "saeed", 1);
        Review rev4 = new Review("Normal" , "hamza", 4);
        restaurant.addReview(rev1);
        restaurant.addReview(rev2);
        restaurant.addReview(rev3);
        restaurant.addReview(rev4);
        System.out.println(restaurant.toString());


        Shop shop = new Shop("H&M" , 5,"Nice place");
        Review rev11 = new Review("nice" , "nabeel", 3);
        Review rev12 = new Review("good" , "mustafa", 2);
        Review rev13 = new Review("bad" , "mazen", 1);
        shop.addReview(rev11);
        shop.addReview(rev12);
        shop.addReview(rev13);
        System.out.println(shop.toString());


        Theater theater = new Theater("Taj cinema" , 3);
        theater.addMovie("God father");
        theater.addMovie("home alone");
        theater.addMovie("onward");
        theater.removeMovie("marvel");
        theater.addMovie("mr.robot");
        Review rev21 = new Review("bad" , "thaer", 1 , "God father");
        Review rev22 = new Review("good" , "saif", 2 , "home alone");
        Review rev23 = new Review("very good" , "belal", 4);
        Review rev24 = new Review("great" , "Ahmed", 5, "marvel");
        theater.addReview(rev21);
        theater.addReview(rev22); // Try duplication
        theater.addReview(rev23);
        theater.addReview(rev24);
        System.out.println(theater.toString());
    }








}