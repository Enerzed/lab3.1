
import java.util.Scanner;

public class CarShop
{
    private static int Count = 0;
    private int id;
    private String adress;
    private Car [] cars = new Car[128];
    private Worker [] workers = new Worker[128];
    private MonthResult [] month_results = new MonthResult[128];
    public CarShop()
    {
        Count++;
        this.id = Count;
        for (int i = 0; i < 128; i++)
        {
            this.cars[i] = new Car();
            this.workers[i] = new Worker();
            this.month_results[i] = new MonthResult();
        }
    }
    public CarShop(int my_id, String my_adress, Car [] my_cars, Worker [] my_workers, MonthResult [] my_month_results)
    {
        Count++;
        this.id = Count;
        this.adress = my_adress;
        for (int i = 0; i < 128; i++)
        {
            this.cars[i] = my_cars[i];
            this.workers[i] = my_workers[i];
            this.month_results[i] = my_month_results[i];
        }
    }
    void in_car_shop()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input adress:");
        this.adress = scanner.nextLine();

        int cars_quantity = 0;

        System.out.println("input car quantity:");
        cars_quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0;i < cars_quantity;i++)
        {
                this.cars[i].in_car();
        }
        int workers_quantity = 0;

        System.out.println("input worker quantity:");
        workers_quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i < workers_quantity;i++)
        {
            this.workers[i].in_worker();
        }
        int month_results_quantity = 0;

        System.out.println("input month results quantity:");
        month_results_quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i < month_results_quantity;i++)
        {
            this.month_results[i].in_month_result();
        }
        scanner.close();
    }
    void print_car_shop_all_info(int quantity_of_cars, int quantity_of_workers, int quantity_of_months)
    {
        System.out.printf("id = %d\nadress = %s\n",id, adress);
        for (int i = 0;i < quantity_of_cars;i++)
            cars[i].print_car();
        for (int i = 0;i < quantity_of_workers;i++)
            workers[i].print_worker();
        for (int i = 0;i < quantity_of_months;i++)
            month_results[i].print_month_result();
    }
    public static int GetCount()
    {
        return Count;
    }
    public int GetId()
    {
        return this.id;
    }
    public String GetAdress()
    {
        return this.adress;
    }
    public Car[] GetCars()
    {
        return this.cars;
    }
    public Worker[] GetWorkers()
    {
        return this.workers;
    }
    public MonthResult[] GetMonthResults()
    {
        return this.month_results;
    }
}
