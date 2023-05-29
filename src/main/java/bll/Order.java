
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order implements Serializable, Comparable {
    private int orderId;
    private String clientId;
    private LocalDateTime orderDate;
    private double price;

    public Order(int orderId, String clientId, LocalDateTime orderDate, double price) {
        this.orderId = orderId;
        this.clientId = clientId;
        this.orderDate = orderDate;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getClientId() {
        return clientId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
