package SolidViolation;

public class Product {
    String pName;
    int price;

    Product(String pName, int price)
    {
        this.pName=pName;
        this.price=price;
    }
    public String toString()
    {
        return "Product [ " + "pName= " + pName + " / " + ", price = " + price + " ]";
    }
}


