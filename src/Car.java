
import java.io.IOException;
import java.util.*;

public class Car extends Vehicle
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
    public void In() throws StringValuesException
    {
        String SOLD = "SOLD";
        String IN_STOCK = "IN STOCK";
        String DISCONTINUED = "DISCONTINUED";
        Scanner scanner = new Scanner(System.in);
        System.out.println("input name:");
        this.name = scanner.nextLine();
        if(this.name == "")
            throw new StringValuesException("Empty name");
        System.out.println("input status:");
        this.status = scanner.nextLine();
        if(!this.status.equals(SOLD) && !this.status.equals(IN_STOCK) && !this.status.equals(DISCONTINUED))
            throw new StringValuesException("Values must be 'SOLD', 'IN STOCK' OR 'DISCONTINUED'");
        try{
            this.specs.in_car_specs();
        }catch(IntegerValuesException e){
            System.err.println(e.getMessage());
        }
        //scanner.close();
    }
    public void Print()
    {
        System.out.printf("id = %d\nname = %s\nstatus = %s\n",id, name, status);
        this.specs.print_specs();
    }
    public String ConcatNameStatus(Car car)
    {
        //если представить что много строк складываются, то это имело бы довольно большой смысл
        //производительность такой операции намного больше
        StringBuilder sb = new StringBuilder();
        sb.append(car.name);
        sb.append(" ");
        sb.append(car.status);
        //и таких присоединений полным полно!
        return sb.toString();
        //а если не так, то конвертации в string после каждого присоединения (не приятно и не быстро)
    }
    public int FindFasterCar(Car comparable_car)
    {
        //возращает 1, если машина, с которой сравнивают (comparable_car), имеет большую скорость
        int flag = 0;
        if (this.specs.GetSpeed()>comparable_car.specs.GetSpeed())
            flag = 1;
        return flag;
    }
    public int FindLighterCar(Car comparable_car)
    {
        //возращает 1, если машина, с которой сравнивают (comparable_car), имеет меньший вес
        int flag = 0;
        if (this.specs.GetWeight()<comparable_car.specs.GetWeight())
            flag = 1;
        return flag;
    }
    public int FindMorePowerfulCar(Car comparable_car)
    {
        //возращает 1, если машина, с которой сравнивают (comparable_car), имеет большую мощность
        int flag = 0;
        if (this.specs.GetPowerOfEngine()>comparable_car.specs.GetPowerOfEngine())
            flag = 1;
        return flag;
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