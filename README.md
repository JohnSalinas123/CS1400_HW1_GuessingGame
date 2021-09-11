# CS2400_HW1_GuessingGame
## a program that asks the computer to guess a number between 1 and 100, that the user has selected

Write a program that plays a 'number guessing game'.  Note that the player picks the number and the program attempts to determine the number chosen.  The algorithm:

Ask the player to pick a number between 1 and 100.
Initialize two variables, low to start at 1 and high to start at 100.
Loop until the program has found the correct answer, or until it becomes apparent that the user made a mistake:
Pick a number between low and high, call it guess.
Ask the player if guess is the correct number.  The player should respond with a '0' if guess is correct, '-1' if guess is too big (so it should go down some, and '1' if guess is too low (and so it should go up some).
If guess is correct, the program should brag that it has found the correct number, then exit.
If guess is too high, we know the real number is between low and guess - 1, so set high to guess - 1, then iterate.
If guess is too low, we know the real number is between guess + 1 and high, so set low to guess + 1, then iterate.
However, the user may have made a mistake, or lied!  If the program gets to the point where the low and high values are the same number, if the user does not say that is correct, then we have an error condition.  The program should print a blistering comeback, then quit.

There are several possible ways for you to do step 3A.  You can pick a random number in the range, or you might find a more efficient way to pick a guess.  Your grade for this assignment does not depend upon the efficiency of your algorithm!

Be sure you have a comment line at the top of your program with your name -- you don't want the grader to give your points to someone else!
