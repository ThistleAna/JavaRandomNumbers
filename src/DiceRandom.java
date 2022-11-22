// call the Random class
import java.util.Random;

// this program will generate a random number between 1-10
public class DiceRandom {
    public static void main(String[] args) {
        // create an instance
        Random randomNum = new Random();

        // create int number generator
        int x = (randomNum.nextInt(10))+1;

        System.out.println(x);
    }
}
