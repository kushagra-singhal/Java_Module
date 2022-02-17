public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult("John", "Batman"));
    }//end main

    public static String getResult(String str1, String str2){
        return str1 + " " + str2;
    }
}
