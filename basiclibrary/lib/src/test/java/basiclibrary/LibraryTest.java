/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library functionTest = new Library();

    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    public void rollTest() {
        int n = 4;
        assertEquals(n, functionTest.roll(n).size());
//    assertEquals(6 , testing.roll(n).size());
    }


    @Test
    public void duplicateTest() {
        assertTrue(functionTest.containsDuplicates(new int[]{4, 5, 5, 4, 6}));

    }

    @Test
    public void avgData() {

        assertEquals(5, functionTest.arrayOfNumber(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    void temperature() {
        int[][] input = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String output = "\nnever saw temperature 63" + "\nnever saw temperature 67" + "\nnever saw temperature 68" + "\nnever saw temperature 69";

        assertEquals(output, functionTest.analyzingWeatherData(input));


    }
    @Test void votesTest(){
        List<String> votes = new ArrayList<String>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String output="Bush";

        assertEquals(output , functionTest.tally(votes));

    }



}