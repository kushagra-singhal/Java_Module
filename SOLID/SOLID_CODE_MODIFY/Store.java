package SOLID_CODE_MODIFY;
 import java.util.List;

public class Store 
{
    private List<Product> productList;
    protected Payment payment;

    private PrintServices printServices = new PrintServices();;

    Store(List<Product> productList)
    {
        this.productList=productList;
    }

    public List<Product> viewProduct()
    {
        return productList;
    }

    public void buyProduct(String name,PaymentType paymentType,SavePayment savePayment)
    {
        System.out.println(name+" is bought");
        paymentType.processPayment();

        printServices.printPaymentInfo(savePayment);

    }
}
 //Satisfies DIP - High level modules are not depending on Low level modules rather on interfaces.