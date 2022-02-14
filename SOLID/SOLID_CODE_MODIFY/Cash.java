package SOLID_CODE_MODIFY;

class Cash implements PaymentType, SavePayment 
{

    @Override
    public void savePayment() {
       System.out.println(" Cash Payment Info");
        
    }

    @Override
    public void processPayment() {
        System.out.println("Payment by Cash");
        
    }
    
}
