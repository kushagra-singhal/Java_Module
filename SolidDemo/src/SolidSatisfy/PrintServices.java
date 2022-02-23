package SolidSatisfy;

public class PrintServices {
    public void printPaymentInfo(SavePayment savePayment)
    {
        savePayment.savePayment();
        System.out.println(" Payment details printed here");
    }
}
