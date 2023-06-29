package lambdaexpression;
import java.util.ArrayList;
import java.util.List;

public class OrderApplication {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ACCEPTED", 54000));
        orders.add(new Order("COMPLETED", 7000));
        orders.add(new Order("PENDING", 2300));
        orders.add(new Order("ACCEPTED", 5000));

        orders.stream()
                .filter(order -> order.getPrice() > 10000 && (order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED")))
                .forEach(order -> System.out.println("Order: Price - " + order.getPrice() + ", Status - " + order.getStatus()));
    }
}


