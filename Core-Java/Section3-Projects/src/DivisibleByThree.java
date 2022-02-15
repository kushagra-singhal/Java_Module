import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter your number");
        input = keyboard.nextInt();

        if(input % 3 == 0){
            System.out.println(input + " divisible by 3");
        }
        else {
            System.out.println("Ehh!! "+input + " is not divisible by 3");
        }
    }//end main
}
