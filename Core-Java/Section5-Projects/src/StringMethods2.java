public class StringMethods2 {
    public static void main(String[] args){
        String myName = "Dexter Kush";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsD = myName.indexOf("K");

        String lastName = myName.substring(7);

        System.out.println("UPPER is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("D is at index " + whereIsD);
        System.out.println("Last name is " + lastName);
    }//end main
}
