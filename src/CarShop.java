
import java.util.*;

public class CarShop
{
    private static int Count = 0;
    private int id;
    private String adress;
    private Car [] cars = new Car[128];
    private Worker [] workers = new Worker[128];
    private MonthResult [][] month_results = new MonthResult[128][12];
    public CarShop()
    {
        Count++;
        this.id = Count;
        for (int i = 0; i < 128; i++)
        {
            this.cars[i] = new Car();
            this.workers[i] = new Worker();
            for(int j = 0; j < 12; j++)
                this.month_results[i][j] = new MonthResult();
        }
    }
    public CarShop(int my_id, String my_adress, Car [] my_cars, Worker [] my_workers, MonthResult [][] my_month_results)
    {
        Count++;
        this.id = Count;
        this.adress = my_adress;
        for (int i = 0; i < 128; i++)
        {
            this.cars[i] = my_cars[i];
            this.workers[i] = my_workers[i];
            for(int j = 0; j < 12; j++)
                this.month_results[i][j] = my_month_results[i][j];
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
            try{
                this.cars[i].In();
            }catch(StringValuesException e){
                System.err.println(e.getMessage());
            }
        }
        int workers_quantity = 0;

        System.out.println("input worker quantity:");
        workers_quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i < workers_quantity;i++)
        {
            this.workers[i].In();
        }
        int month_results_quantity_years = 0;
        int month_results_quantity_months = 0;
        System.out.println("input month results quantity years:");
        month_results_quantity_years = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input month results quantity months:");
        month_results_quantity_months = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i < month_results_quantity_years+1;i++)
        {
            if(i!=month_results_quantity_years)
            {
                for(int j = 0;j < 12;j++)
                this.month_results[i][j].In();
            }
            else
            {
            for(int j = 0;j < month_results_quantity_months;j++)
                this.month_results[i][j].In();
            }
        }
        //scanner.close();
    }
    void print_car_shop_all_info(int quantity_of_cars, int quantity_of_workers, int quantity_of_years, int quantity_of_months)
    {
        System.out.printf("id = %d\nadress = %s\n",id, adress);
        for (int i = 0;i < quantity_of_cars;i++)
            cars[i].Print();
        for (int i = 0;i < quantity_of_workers;i++)
            workers[i].Print();
        for (int i = 0;i < quantity_of_years+1;i++)
        {
            if(i!=quantity_of_years)
            {
            for(int j = 0;j < 12; j++)
                month_results[i][j].Print();
            }
            else
            {
            for(int j = 0;j < quantity_of_months;j++)
                month_results[i][j].Print();
            }
        }
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
    public MonthResult[][] GetMonthResults()
    {
        return this.month_results;
    }
}
