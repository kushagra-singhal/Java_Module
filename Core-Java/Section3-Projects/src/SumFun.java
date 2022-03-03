import java.util.Scanner;

public class SumFun {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input;

        //priming read
        System.out.println("Enter the non-negative to add  to sum");
        System.out.println("Enter a negative number to exit!");
        input = keyboard.nextInt();

        while (input >= 0){
            sum += input; // sum= sum + input
            System.out.println("Enter the non-negative to add  to sum");
            System.out.println("Enter a negative number to exit!");
            input = keyboard.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
