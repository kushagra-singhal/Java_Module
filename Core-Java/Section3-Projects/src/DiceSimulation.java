import java.util.Random;

public class DiceSimulation {
    public static void main(String [] args){
        Random random = new Random();

        int diceVal;
//        int sum = 0;


        for(int i =0; i < 10; i++){
            diceVal = random.nextInt(6) + 1;
//            sum = sum + diceVal;
            System.out.println(" " +diceVal);}

//            System.out.println("Sum is " +sum);

        }
    }

