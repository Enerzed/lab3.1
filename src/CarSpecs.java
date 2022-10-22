
import java.util.Scanner;

public class CarSpecs
{
    private int speed;
	private int weight;
	private int power_of_engine;
    public CarSpecs()
    {

    }
    public CarSpecs(int my_speed, int my_weight, int my_power_of_engine)
    {
        this.speed = my_speed;
        this.weight = my_weight;
        this.power_of_engine = my_power_of_engine;
    }
    public int CompareCarSpecs(int operation, CarSpecs comparable_specs)
    {
        int flag = 0;
        if (operation == 0)
        {
            if (this.speed < comparable_specs.speed)
                flag = 1;
        }
        else if (operation == 1)
        {
            if (this.weight < comparable_specs.weight)
                flag = 1;
        }
        else if (operation == 2)
        {
            if (this.power_of_engine < comparable_specs.speed)
                flag = 1;
        }
        else flag = -1;
        return flag;
    }
    public void in_car_specs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input speed:");
        this.speed = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input weight:");
        this.weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input power of engine:");
        this.power_of_engine = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
    }
    public void print_specs()
    {
        System.out.printf("speed = %d, weight = %d, power of engine = %d\n", this.speed, this.weight, this.power_of_engine);
    }
}