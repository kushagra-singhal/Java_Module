package SOLID_CODE_VIOLATION;

public class Payment implements PaymentType
{
    public void paymentprocessing(String paymentType)
    {
        if(paymentType.equalsIgnoreCase("cash"))
        {
            System.out.println("Payment by Cash");
        }
        else if(paymentType.equalsIgnoreCase("debitCard"))
        {
            System.out.println("Payment by Debit Card"); //this violates OCP
        }
    }
                //this violates SRP
    @Override
    public void processPayment() {
        // logic for Payments here.
        
    }

    @Override
    public void savePayments() {
        // logic for Payments here.
        
    }

    @Override
    public void saveCardInfo() {
        // logic for Payments here.
        
    }

    
}
