import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        CarShop car_shop1 = new CarShop();
        int count = CarSpecs.GetCount();
        System.out.printf("CARSPECSCOUNT = %d\n",count);
        car_shop1.print_car_shop_all_info(0, 0, 0);
    }
}
