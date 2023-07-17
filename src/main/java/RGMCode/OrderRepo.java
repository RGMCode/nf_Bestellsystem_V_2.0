package RGMCode;

import java.util.List;

public class OrderRepo {

    private List<Order> orders;

    public List<Order> list() {
        return orders;
    }

    public Order get(String id){
        for (Order order : orders){
            if (order.getId().equals(id)){
                return order;
            }
        }
        return null;
    }

    public void add(Order order){
        orders.add(order);
    }

}
