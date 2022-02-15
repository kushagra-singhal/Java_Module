import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double dubinput;

        System.out.println("What is your name");
        name = keyboard.nextLine();

        System.out.println("What's your Age?");
        age = keyboard.nextInt();
        keyboard.nextLine();        //when using nextInt use nextLine to consume the new line

        System.out.println("whats your real number");
        dubinput = keyboard.nextDouble();
        keyboard.nextLine();
        dubinput *= 2;

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println(name + " 's Age is"   +age);
        System.out.println(name + " live in " +city);
        System.out.println("Twice your number is " +dubinput);

    }//end main
}
