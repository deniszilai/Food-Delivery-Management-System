
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class CompositeProduct extends MenuItem implements Serializable {

    private String title;
    private double price;
    private List<MenuItem> products;

    public CompositeProduct(String title) {
        products = new ArrayList<>();
        this.title = title;
    }

    public void addProduct(MenuItem product) {
        products.add(product);
        this.computePrice();
    }

    @Override
    public double computePrice() {
        price = 0;
        for (MenuItem i : products) {
            price = price + i.computePrice();

        }
        return price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getCalories() {
        int calories = 0;
        for (MenuItem i : products) {
            calories = calories + i.getCalories();
        }
        return calories;
    }

    @Override
    public int getProtein() {
        int protein = 0;
        for (MenuItem i : products) {
            protein = protein + i.getProtein();
        }
        return protein;

    }

    @Override
    public int getFat() {
        int fat = 0;
        for (MenuItem i : products) {
            fat = fat + i.getFat();
        }
        return fat;
    }

    @Override
    public int getSodium() {
        int sodium = 0;
        for (MenuItem i : products) {
            sodium = sodium + i.getSodium();
        }
        return sodium;
    }

    @Override
    public String toString() {
        return "CompositeProduct{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", products=" + products +
                '}';
    }

    public List<MenuItem> getProducts() {
        return products;
    }
}
