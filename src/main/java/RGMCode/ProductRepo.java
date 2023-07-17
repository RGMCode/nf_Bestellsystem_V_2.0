package RGMCode;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo(){
        products = new ArrayList<>();
        products.add(new Product("1", "Brot"));
        products.add(new Product("2", "Nutella"));
    }

    public List<Product> list(){
       return products;
    }

    public Product get(String id){
        for (Product product : products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }


}
