package lambdaexpression;
import java.util.ArrayList;
import java.util.List;

class Order {
    private String status;
    private double price;

    public Order(String status, double price) {
        this.status = status;
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }
}


