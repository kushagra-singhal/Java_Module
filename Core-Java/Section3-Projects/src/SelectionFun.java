import java.util.Scanner;

public class SelectionFun {
    public static void main (String [] args){
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Gin and Ginger");

        System.out.println("Please enter your age");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if(age>=21){
            System.out.println("Here! have a beer");
        }
        else if(age >= 16) {
            System.out.println("Here! Have a coke");
            System.out.println("Atleast you can Drive!");
        }
        else {
            System.out.println("Here! have a Coke!");
        }


        System.out.println("\nThanks for coming to G&G");
    }
}
