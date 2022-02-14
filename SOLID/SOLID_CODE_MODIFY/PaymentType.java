package SOLID_CODE_MODIFY;

public interface PaymentType 
{
    public void processPayment();
}

interface SavePayment
{
    public void savePayment();
}

interface saveCard
{
    public void saveCardInfo();
}
   //Satisfies the OCP - we can add more interfaces as req in future

   //also Satisfies Interface Segregation Principle