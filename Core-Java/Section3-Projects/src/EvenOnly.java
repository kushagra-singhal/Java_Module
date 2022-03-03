public class EvenOnly {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10){

            if(count % 2 != 0){
                count++;
                continue;      //this skips the odd numbers
            }
            System.out.print("\n" +count);

            count++;
        }
    }
}
