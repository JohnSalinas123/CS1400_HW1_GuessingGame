// John Salinas
// CS 1400

import java.util.Scanner;
//import java.math.*;

public class GuessingGame {

    public static void main(String[] args) {

   /* Intializing variable */
    int low = 1;
    int high = 100;
    int middle;
    int response = -1;
    int leftOrRight = 0;


    System.out.println("Pick a number between 1 and 100.");
    Scanner key = new Scanner(System.in);
    int number = key.nextInt();
    //key.close();
    //System.out.println("The number was: " + number);
    middle = (high + low)/2;

    /* For testing */
    //System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");
    
    while (response != 0) {
        

        System.out.println("Is your number " + middle);
        System.out.println("Type 0 if it is the number,-1 if its too big, or 1 if its too low");
        Scanner keyboard = new Scanner(System.in);
        response = keyboard.nextInt();

       if (high == low && (response == 1 || response == -1)) {
            System.out.println("There's no way I couldn't find your number, you must have made a mistake!");
            break;
        }
        else if (response == 0) {
            System.out.println("Of course I was able to guess the correct number!");
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

        /*
        if (leftOrRight == 0) {
           if (response == -1) {
                leftOrRight = -1;
           } else {
               leftOrRight = 1;
           }
        }
        */
        //System.out.println("You went: " + leftOrRight);

        if (leftOrRight == -1) {
            doubleMid = Math.ceil(doubleMid);
        } else {
            doubleMid = Math.floor(doubleMid);
        }

        middle = (int)doubleMid;
        

        

        /* For testing */
        //System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");

        /*
        if (high == low) {
            System.out.println("There's no way i couldn't guess the right number!");
            break;
        }
        */
        
    }

    //keyboard.close();

    }       

}