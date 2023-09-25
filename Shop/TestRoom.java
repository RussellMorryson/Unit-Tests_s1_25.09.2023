package Shop;

import java.util.ArrayList;
import java.util.List;

public class TestRoom {
    public static void main (String [] args) {
        Product p1 = new Product ("milk", 100);
        Product p2 = new Product ("chocolate", 200);
        Product p3 = new Product ("bread", 150);
        Product p4 = new Product ("tea", 50);

        List <Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        Shop myShop = new Shop();
        myShop.setProducts(productList);
        myShop.setProducts(myShop.sortProductsByPrice());        
        
        Product maxCostProduct = myShop.getMostExpensiveProduct();
        System.out.println(maxCostProduct.getTitle() + " : " + maxCostProduct.getCost());
    }
}
