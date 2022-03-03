package Lamdas;

public class targeType {

        // i -> i*i;

        public interface Email{
            String constructemail(String name);
        }

        //(String name) -> name + "@dexter.com";            //lambda expression
        Email email = (String name) -> name + "@dexter.com";  //looking for the return type/ target type(String)

        public String getEmail(String name, Email email){           //functional interface
            return null;
        }

        public static void main(String[] args) {

            //new TargetType().getEmail("kushagra", (String name) -> name +"@dexter.com");

        }
    }

    // target typing enables the type of the lambda expression to be inferred from the context where this particular lambda expression is being executed.



        //Method references

//
//        (trade) -> trade.isOpen();
//
//        trade::isOpen;              //method reference


        //Constructor References

//        MovieFactory m1 = i -> new Movie(i);
//
//        MovieFactory m2 = Movie::new;           //Constructor Ref


        //Type Inference

//        (list<trade> trades, PriceSkewer priceskewer) ->{ //logic here}
//
//        (trades, priceskewer) -> {//logic here}