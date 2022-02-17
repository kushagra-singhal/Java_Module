public class MethodCalls {
    public static void main(String[] args) {
        doSomething();      //main method calling doSomething method

    }//end main

    public static void doSomething(){
        System.out.println("In doSomething");

        int result = getSomeValue();        //doSomething method calling getSomeValue method

        System.out.println("result: " + result);
    }

    public static int getSomeValue(){
        return 150;
    }
}
