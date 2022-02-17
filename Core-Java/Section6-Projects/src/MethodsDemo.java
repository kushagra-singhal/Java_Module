public class MethodsDemo {
    public static void main(String[] args) {        //method header
        printHello();
        printNumber(10);
        int result = giveMe10();
        double dResult;
        System.out.println(result);

        result = addThese(3,5);
        System.out.println(result);

        dResult = sqaure(1.3);
        System.out.println(dResult);

        System.out.println(sqaure(5.5));


    }//end main

    //void, parameterless
    public static void printHello(){
        System.out.println("hello there!");
    }//end printHello

    //void, parameterized
    public static void printNumber(int a) {
        System.out.println("The Number is: " +a);
    }//end printNumber

    //value-returning, parameterless
    public static int giveMe10(){
        return 10;
    }//end giveMe10

    //value-returning, parameterized
    public static int addThese(int num1, int num2){
        return num1 + num2;
    }//end addThese

    public static double sqaure(double num) {
        return num * num;
    }//end square
}
