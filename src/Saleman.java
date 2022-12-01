import java.util.*;

public class Saleman extends Worker {
    private double SaleRate;
    public Saleman()
    {

    }
    public Saleman(int my_id, String my_name, String my_job, int my_salary, double my_salerate)
    {
        super(my_id, my_name, my_job, my_salary);
        this.SaleRate = my_salerate;
    }
    public void Print()
    {
        super.Print();
        System.out.printf("salerate = %f\n",SaleRate);
    }
    public void In()
    {
        super.In();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input salerate:");
        this.SaleRate = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public String toString()
    {
        return "id = "+id+" name = "+name+" job = "+job+" salary = "+salary+" salerate = "+SaleRate;
    }
}
