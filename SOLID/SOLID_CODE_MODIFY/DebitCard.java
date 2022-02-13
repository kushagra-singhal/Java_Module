package SOLID_CODE_MODIFY;

public class DebitCard implements PaymentType, SavePayment, saveCard 
{

    @Override
    public void saveCardInfo() {
        System.out.println(" debit Card Info is Saved ");
        
    }

    @Override
    public void savePayment() {
        System.out.println(" Card Payment Info ");
        
    }

    @Override
    public void processPayment() {
        System.out.println(" Payment by Debit Card ");
        
    }

        
}
