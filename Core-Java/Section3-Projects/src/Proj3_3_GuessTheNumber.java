import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        Random random = new Random();
        boolean guessedNumber = false;
        computerNumber = random.nextInt(100)+1; //shifting

        while (!guessedNumber){
            System.out.println("Enter your Guess ");
            ourGuess = keyboard.nextInt();
            guessCount++;

            if(ourGuess >=1 && ourGuess <=100) {
                if (ourGuess == computerNumber) {
                    System.out.println("Congratulation ! You guessed the number in " + guessCount + " guesses.");
                        guessedNumber = true;
                }
                else if (ourGuess > computerNumber) {
                    System.out.println("Your guess is too high");

                }
                else {  //too low
                    System.out.println("our guess is too low");
                }
            }
            else {
                //invalid guess
                System.out.println("That was a wasted guess. You have to pick a number between 1 and 100 inclusive");
                }


        }//end while

    }//end main
}
