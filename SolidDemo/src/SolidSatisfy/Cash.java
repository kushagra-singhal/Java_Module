package SolidSatisfy;

class Cash extends PrintServices implements PaymentType, SavePayment      //this also satisfies LSP since Cash is only implementing the savePayment and not saveCardInfo
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

