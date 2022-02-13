package SOLID_CODE_MODIFY;

public class PrintServices 
{
    public void printPaymentInfo(SavePayment savePayment)
    {
        savePayment.savePayment();
        System.out.println(" payment details printed here");
    }
}
