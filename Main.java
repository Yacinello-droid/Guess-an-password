package IDK;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pass = new Scanner( System.in );

        System.out.println("Guess an password! (1-1000)");

        // password is 885

        int a = pass.nextInt();

        if (a == 885) {
            System.out.println("You've guessed!");
        }
        else if (a < 885) {
            System.out.println("More");
        }
        else if (a > 885) {
            System.out.println("Less");
        }
    }
}

