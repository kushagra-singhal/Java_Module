package Lamdas;

public class CreatingLamdas {
    interface Greeting{
        public String sayHello(String g);
    }

    public  void testGreeting(String a, Greeting g){
        String result = g.sayHello(a);

        System.out.println("Result:"+result);
    }

    public static void main(String[] args) {
        //input -> body
//        (String s) -> "hello, "+s;
        new CreatingLamdas().testGreeting("Harry",(String s) -> "Hello, "+s);

        new CreatingLamdas().testGreeting("Mr. Dexter",(String s) -> "Hello, "+s);

        // (String p) -> !p.isEmpty()? "Howdy, "+p : "Did you miss something"?
        new CreatingLamdas().testGreeting("",                   //empty string
                (String p) -> !p.isEmpty()? "Howdy, "+p : "Did you miss something?");

    }
}
