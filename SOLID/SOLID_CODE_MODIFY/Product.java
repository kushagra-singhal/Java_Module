package SOLID_CODE_MODIFY;


public class Product 
{
    String pName;
    int price;


    Product(String pName, int price)
    {
        this.pName=pName;
        this.price=price;
    }

    @Override
    public String toString()
    {
        return "Product [" + "pName = " + pName + "/ " + ", price = " + price + " ]";
    }

}
