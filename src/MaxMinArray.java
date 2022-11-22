//  import the Random class
import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {
        // create the random instance
        Random rand = new Random();

        // create an empty array with the size 5
        int[] numArray = new int[5];

        System.out.println("Generating random integer arrays");

        // generating the random int
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rand.nextInt(10) + 1;
            System.out.println(numArray[i]);
        }

        //max value
        int maxValue = numArray[0];

        for (int i=1; i<numArray.length; i++) {
            //compare the value, retain the bigger one
            if (numArray[i] > maxValue) {
                maxValue = numArray[i];
            }
        }
        System.out.println("Max value is " + maxValue);


    //min value
        int minValue = numArray[0];

        for (int i=1; i<numArray.length; i++) {
            //compare the value, retain the smaller one
            if (numArray[i] < maxValue) {
                minValue = numArray[i];
            }
        }
        System.out.println("Min value is " + minValue);

    }
}
