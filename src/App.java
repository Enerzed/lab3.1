import java.util.*;

public class App {
    public static void main(String[] args) throws Exception
    {
        CarShop car_shop1 = new CarShop();
        int count = CarSpecs.GetCount();
        car_shop1.in_car_shop();
        
        car_shop1.print_car_shop_all_info(1, 1, 1, 1);
    }
}
