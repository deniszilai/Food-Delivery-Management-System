
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;

public interface IDeliveryServiceProcessing {

    void importProducts(String path) throws IOException;

    void addProduct(MenuItem i);

    void deleteProduct(MenuItem i);

    void modifyProduct(MenuItem i);

    List<Order> generateReportA(int startHour, int endHour);

    List<MenuItem> generateReportB(int specifiedNumber);

    List<String> generateReportC(int nr, double price);

    List<MenuItem> searchByType(String type);

    List<MenuItem> searchByRating(double rating);

    List<MenuItem> searchByCalories(int nrCalories);

    List<MenuItem> searchByProteins(int proteins);

    List<MenuItem> searchByFats(int fats);

    List<MenuItem> searchBySodium(int sodium);

    List<MenuItem> searchByPrice(double price);


}
