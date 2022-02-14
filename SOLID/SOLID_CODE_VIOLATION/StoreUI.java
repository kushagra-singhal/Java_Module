package SOLID_CODE_VIOLATION;

import java.util.ArrayList;
import java.util.List;

public class StoreUI 
{
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
   
        list.add(new Product("soap",25));
        list.add(new Product("oil",50));
        list.add(new Product("pen",20));
        list.add(new Product("chocolate",100));
        list.add(new Product("sugar",70));

        Store store = new Store(list);
        System.out.println(store.viewProduct().toString());

        store.buyProduct("bread", "cash");
    }
}

