import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        clock ();

    }

    public static String pluralize(String text, int number) {
        if (number == 1) {
            return text;
        } else if (number == 0 || number > 1) {
            return text + "s";
        }
        return text;

    }

    public static void flipNHeads(int n) {
        int x = 0;
        int h = 0;

        while (h != n) {
            double flip = Math.random();
            if (flip >= 0.5) {
                h++;
                x++;
                System.out.println("head");

            } else {
                h = 0;
                x++;
                System.out.println("tail");
            }
        }
        System.out.println("It took " + x + " flips to flip " + n + " head in a row.");
    }

    public static void clock () {
        while (true) {
            LocalDateTime timeNow = LocalDateTime.now();
            String timeRun = timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(timeRun);
            try {
                Thread.sleep(1000);
            } 
            catch (Exception ex) {
                
            }
        }
    }

}