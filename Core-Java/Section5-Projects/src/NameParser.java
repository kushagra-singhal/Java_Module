import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String lastName;

        System.out.println("Enter your Full Name");
        String fullName = keyboard.nextLine();

        int indexOfSpace = fullName.indexOf(" ");

        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);

        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();

        System.out.println("First Name is " + firstName);
        System.out.println("Last name is " + lastName);

    }
}
