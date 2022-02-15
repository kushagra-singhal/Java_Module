public class RelationalFun {
    public static void main(String [] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 10;
        int yourAge = 20;
        int ramsAge = 101;
        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations

        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge is? : " + ageComparison);

        ageComparison = yourAge > ramsAge;
        System.out.println("yourAge > ramsAge? : " +ageComparison);

        ageComparison = yourAge == ramsAge;
        System.out.println("yourAge equals ramsAge?: " +ageComparison);

        ageComparison = yourAge != ramsAge;
        System.out.println("yourAge not equals ramsAge?: " +ageComparison);

        ageComparison = myAge == ramsAge;
        System.out.println("myAge equals ramsAge?: " +ageComparison);

    }
}
