package SOLID_CODE_VIOLATION;
import java.util.List;

public class Store 
{
    private List<Product> productList;
    protected Payment payment;  //tightly coupled i.e this violateds DIP

    Store(List<Product> productList)
    {
        this.productList=productList;
    }

    public List<Product> viewProduct()
    {
        return productList;
    }

    public void buyProduct(String name, String paymentType)
    {
        System.out.println(name + "is bought");
        payment.paymentprocessing(paymentType);
    }

    public void printPaymentInfo()
    {
        System.out.println("print all payment details");
    }
}
