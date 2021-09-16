// John Salinas
// CS 1400

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

   /* Intializing variable */
    int low = 1;
    int high = 100;
    int middle;
    int response = -1;
    int leftOrRight = 0;

    String didNotGuess = "There's no way I couldn't find your number, you must have made a mistake!";


    System.out.println("Pick a number between 1 and 100.");
    middle = (high + low)/2;

    /* For testing */
    //System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");
    
        while (response != 0) {
            
            if (leftOrRight != 0 && middle == 50) {
                System.out.println(didNotGuess);
                break;
            }

            System.out.println("Is your number " + middle);
            System.out.println("Type 0 if it is your number,-1 if it's too big, or 1 if it's too low");
            // Ignored warning - Resource leak:'keyboard' is never closed
            Scanner keyboard = new Scanner(System.in);
            response = keyboard.nextInt();

            if (high == low && (response == 1 || response == -1)) {
                System.out.println(didNotGuess);
                keyboard.close();
                break;
            }
            else if (response == 0) {
                System.out.println("I knew I could find the right number, I'm a computer after all!");
            }


            if (response != 0) {
                if (response == -1) {
                // This means that the guess was too high.
                high = middle - 1;

                    if (leftOrRight == 0) {
                        leftOrRight = -1;
                    }
                
                } else if (response == 1) {
                // This means that the guess too low.
                low = middle + 1;

                    if (leftOrRight == 0) {
                        leftOrRight = 1;
                    }
                }
            }

            double doubleHigh = high;
            double doubleLow = low;
            double doubleMid = (doubleHigh + doubleLow)/2;

            /* For testing */
            //System.out.println("You went: " + leftOrRight);

            if (leftOrRight == -1) {
                doubleMid = Math.ceil(doubleMid);
            } else {
                doubleMid = Math.floor(doubleMid);
            }

            middle = (int)doubleMid;

            /* For testing */
            //System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");

        }

        

    }       

}