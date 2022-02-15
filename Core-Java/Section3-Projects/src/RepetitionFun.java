import java.util.Scanner;

public class RepetitionFun {
    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);
        int input;

        //printing read
        System.out.println("Enter a non-negative number");
        System.out.println("Or negative to Exit");
        input = keyboard.nextInt();

        while (input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative number");
            System.out.println("Or negative to Exit");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");


//        int count = 0;
//
//        while(count < 10) {
//            System.out.println(count);
//            count++;
//        }//end while

//        int count2 = 15;
//
//        do {
//            System.out.println(count2);  //do-while iterates atleast once
//            count2++;
//        }
//        while (count2 < 10);

//        for (int i= 0; i < 10; i++){
//            System.out.println(i);
//        }// end for



    }//end main
}
