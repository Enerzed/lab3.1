
import java.util.Scanner;

public class Car
{
    private CarSpecs specs;
    private int id;
    private String name;
    private String status;

    public Car() 
    {
        this.specs = new CarSpecs();
    }

    public Car(CarSpecs my_specs, int my_id, String my_name, String my_status)
    {
        this.specs = my_specs;
        this.id = my_id;
        this.name = my_name;
        this.status = my_status;
    }
    public void in_car()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id:");
        this.id = scanner.nextInt();
        scanner.nextLine();
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
};