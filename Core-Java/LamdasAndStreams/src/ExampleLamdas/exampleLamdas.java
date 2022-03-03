package ExampleLamdas;

public class exampleLamdas<Trade> {
    interface Tradable<Trade>{
        boolean check(Trade t);
    };

//    Tradable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();     //examples of passing lambda expressions

//    Tradable<Trade> ibmTradeLambda = (trade) -> trade.getInstrument().equals("IBM");
}


                    //Lambdas Expressions

//(input arguments) -> body
//
//        (String name) -> System.out.println("hello, "+name);           //name with datatype
//
//        (name) -> System.out.println("hello, "+name);       //only name
//
//        Runnable runnable = () -> autoPilot();        //empty
//
//        (Trade t, PricingSkewalgo algo) -. {        //complex L exp
//            //logic here
//        algo.applyPricingSkew(t);
//        return t;
//        }