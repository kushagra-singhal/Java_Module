import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("enter the age: \t");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter your gender");
        gender = keyboard.next().charAt(0);

        if(age >=19 && gender == 'M'){
            System.out.println("You can join the fraternity");
        }
        else {
            System.out.println("you cannot join the Fraternity");
        }
    }
}
