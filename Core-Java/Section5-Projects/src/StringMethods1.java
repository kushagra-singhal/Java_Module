public class StringMethods1 {
    public static void main(String[] args){
        String name = "Kushagra Singhal";
        String name2 = "Kushagra Singhal";
        String name3 = "Kushal";

        for (int i = 0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }//end for
        System.out.println();

        if (name.equals(name2)){
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are not equal");
        }

        if (name.compareTo(name3) > 0){
            System.out.println("name > name3");
        }
        else{
            System.out.println("name <= name3");
        }
    }
}
