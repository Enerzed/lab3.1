
import java.util.Scanner;

public class Car
{
    private static int Count = 0;
    private CarSpecs specs;
    private int id;
    private String name;
    private String status;

    public Car() 
    {
        this.specs = new CarSpecs();
        Count++;
        this.id = Count;
    }

    public Car(CarSpecs my_specs, String my_name, String my_status)
    {
        this.specs = my_specs;
        this.name = my_name;
        this.status = my_status;
        Count++;
        this.id = Count;
    }
    public void in_car()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input name:");
        this.name = scanner.nextLine();
        System.out.println("input status:");
        this.status = scanner.nextLine();
        this.specs.in_car_specs();
        scanner.close();
    }
    public void print_car()
    {
        System.out.printf("id = %d\nname = %s\nstatus = %s\n",id, name, status);
        this.specs.print_specs();
    }
    public static int GetCount()
    {
        return Count;
    }
    public int GetId()
    {
        return this.id;
    }
    public String GetName()
    {
        return this.name;
    }
    public String GetStatus()
    {
        return this.status;
    }
    public void SetSpecs(CarSpecs my_specs)
    {
        this.specs = my_specs;
    }
    public void SetName(String my_name)
    {
        this.name = my_name;
    }
    public void SetStatus(String my_status)
    {
        this.status = my_status;
    }
};