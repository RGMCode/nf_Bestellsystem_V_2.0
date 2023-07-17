package RGMCode;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public Product getProduct(String id){
        return productRepo.get(id);
    }

    public List<Product> listProducts(){
        return productRepo.list();
    }

    public Order getOrder(String id){
        return orderRepo.get(id);
    }

    public List<Order> listOrders(){
        return orderRepo.list();
    }

    public void addOrder(List<String> productIds) throws OrderNotFoundException {
        for (String productId : productIds) {
            if (productRepo.get(productId) == null){
                throw new OrderNotFoundException();
            }
        }
        // Product IDs to Product
        List<Product> products = new ArrayList<>();
        for (String productId : productIds){
            // products.add(productRepo.get(productId));
            Product product = productRepo.get(productId);
            products.add(product);
        }
        Order order = new Order(UUID.randomUUID().toString(), products);
        orderRepo.add(order);
    }

}
