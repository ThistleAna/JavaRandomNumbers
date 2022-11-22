import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        // create random instance
        Random rand = new Random();

        // create array1 and array2 of 10 random numbers
        int [] array1 = new int[10];
        int [] array2 = new int[10];

        // generating the random int for array1
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(20) + 1; // we need to expand this up to 20
            System.out.print(array1[i] + "|");
        }
        System.out.println();

        // generating the random int for array2
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(20) + 1; // we need to expand this up to 20
            System.out.print(array2[i] + "|");
        }

        // find the duplicates
        System.out.println("\nThe duplicates are : ");
        for (int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++) {
                // compare the value, find the same value
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
