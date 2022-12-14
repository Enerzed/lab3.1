
import java.util.*;

public class CarSpecs
{
    private static int Count = 0;
    private int id;
    private int speed;
	private int weight;
	private int power_of_engine;
    public CarSpecs()
    {
        Count++;
        this.id = Count;
    }
    public CarSpecs(int my_speed, int my_weight, int my_power_of_engine)
    {
        this.speed = my_speed;
        this.weight = my_weight;
        this.power_of_engine = my_power_of_engine;
        Count++;
        this.id = Count;
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
    public void in_car_specs() throws IntegerValuesException
    {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("input speed:");
        this.speed = Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.err.println("Not an int type or incorrect");
        }
        if(this.speed <= 0)
            throw new IntegerValuesException("Value of speed must be > 0");
        try{
        System.out.println("input weight:");
        this.weight = Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.err.println("Not an int type or incorrect value");
        }
        if(this.weight <= 0)
            throw new IntegerValuesException("Value of weight must be > 0");
        try{
        System.out.println("input power of engine:");
        this.power_of_engine = Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.err.println("Not an int type or incorrect value");
        }
        if(this.power_of_engine <= 0)
            throw new IntegerValuesException("Value of power of engine must be > 0");
        //scanner.close();
    }
    public void print_specs()
    {
        System.out.printf("id = %d, speed = %d, weight = %d, power of engine = %d\n",this.id, this.speed, this.weight, this.power_of_engine);
    }
    public static int GetCount()
    {
        return Count;
    }
    public int GetId()
    {
        return this.id;
    }
    public int GetSpeed()
    {
        return this.speed;
    }
    public int GetWeight()
    {
        return this.weight;
    }
    public int GetPowerOfEngine()
    {
        return this.power_of_engine;
    }
    public void SetSpeed(int my_speed)
    {
        this.speed = my_speed;
    }
    public void SetWeight(int my_weight)
    {
        this.weight = my_weight;
    }
    public void SetPowerOfEngine(int my_power_of_engine)
    {
        this.power_of_engine = my_power_of_engine;
    }
}