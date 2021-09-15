// John Salinas
// CS 1400

import java.util.Scanner;
//import java.math.*;

public class GuessingGame {

    public static void main(String[] args) {

   
    int low = 1;
    int high = 100;
    int middle;
    int number;
    int response = -1;


    System.out.println("Pick a number between 1 and 100.");
    Scanner key = new Scanner(System.in);
    number = key.nextInt();
    //key.close();
    //System.out.println("The number was: " + number);
    middle = (high + low)/2;

    /* For testing */
    System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");
    
    while (response != 0) {

        System.out.println("Is your number " + middle);
        System.out.println("Type 0 is the it is,-1 if its too big, or 1 if its too low");
        Scanner keyboard = new Scanner(System.in);
        response = keyboard.nextInt();

        if (response != 0) {
            if (response == -1) {
            // This means that the guess was too high.
            high = middle - 1;
            
            } else if (response == 1) {
            // This means that the guess too low.
            low = middle + 1;

            }
        }
        middle = (high + low)/2;

        /* For testing */
        System.out.println("Low: " + low + ", High: " + high + ", Middle: " + middle + "\n");
    }

    //keyboard.close();

    }       

}