/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;
import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


    public static void main(String[] args){
        System.out.println("The array of dice roll is : " + roll(6) );
        int[] array={4,5,6,5,};
        System.out.println("The array contains duplicate values : " + containsDuplicates(array));
        int[] number= {1,3,4,5,3,6};
        System.out.println("Average value of the array elements is : " + arrayOfNumber(number));


        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println("Minimum avg array " + Arrays.toString(minAvgArray(weeklyMonthTemperatures)));

        System.out.println(analyzingWeatherData(weeklyMonthTemperatures));


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        String winner = tally(votes);
        System.out.println(winner + " The winner");
    }


    public  static ArrayList roll(int n){
        ArrayList<Integer> diceArray=new ArrayList<Integer>();
        int max=6;
        int min =1;

        for (int i = 0; i < n; i++){
            int random=(int) (Math.random() * (max-min))+1;
            diceArray.add(random);
        }
        return diceArray;
    }


    public static boolean containsDuplicates(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j ){
                    if (array[i] == array[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static double arrayOfNumber(int[] number){

        double average=0;
        //calculate sum of all array elements
        int sum = 0;

        for (int i : number) {
            sum += i;
        }

        //calculate average value
        average =(double) sum / number.length;
        return average;

    }

    public static int[] minAvgArray(int[][] array){
        int[] otherArray = array[0];
        for (int[] i : array) {
            if (arrayOfNumber(i) < arrayOfNumber(otherArray)) {
                otherArray = i;
            }


        }
        return otherArray;
    }
    public static String analyzingWeatherData(int[][] arr){
        int max = arr[0][0] ;
        int min = arr[0][0];
        HashSet<Integer> temp=new HashSet<Integer>();

        for (int[] parents : arr) {
            for (int child : parents) {
                if (child > max) {
                    max = child;
                }
                if (child < min) {
                    min = child;
                }
                temp.add(child);
            }
        }
        String neverSawTemp = "";
        for (int i = min; i < max; i++) {
            if (!temp.contains(i)){
                neverSawTemp+= ("\nnever saw temperature "+i);
            }
        }

        System.out.println("Maximum temperature: " + max);
        System.out.println("Minimum temperature: " + min);

        return neverSawTemp;
    }

    public static String tally(List<String> votes){
        HashMap<String,Integer> newVotes = new HashMap<String,Integer>();
        String winner = "";
        int maxVotes = 0;

        for (String vote : votes) {
            if (!newVotes.containsKey(vote)) {
                newVotes.put(vote, 1);
            } else {newVotes.put(vote ,newVotes.get(vote)+1 );

            }
        }
        for (Map.Entry<String, Integer> entry : newVotes.entrySet()){
            if (entry.getValue() > maxVotes){
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }




}