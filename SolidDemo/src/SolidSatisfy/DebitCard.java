package SolidSatisfy;

public class DebitCard extends PrintCardInfo implements PaymentType, SavePayment, saveCard           //this satisfies LSP since DebitCard is extending PrintCardInfo class which can be substituted
{

    @Override
    public void saveCardInfo() {
        System.out.println(" Debit Card Info is Saved ");

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
