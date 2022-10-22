
import java.util.Scanner;

public class Worker {
    private int id;
    private String name;
    private String job;
    private int salary;
    public Worker()
    {

    }
    public Worker(int my_id, String my_name, String my_job, int my_salary)
    {
        this.id = my_id;
        this.name = my_name;
        this.job = my_job;
        this.salary = my_salary;
    }
    public void in_worker()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id:");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input name:");
        this.name = scanner.nextLine();
        System.out.println("input job:");
        this.job = scanner.nextLine();
        System.out.println("input salary:");
        this.salary = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
    }
        void print_worker()
        {
            System.out.printf("id = %d\nname = %s\njob = %s\nsalary = %d\n",id, name, job, salary);
        }
        int compare_worker(int operation, Worker comparable_worker)
        {
            int flag = 0;
            if (operation == 0) {
                if (this.salary < comparable_worker.salary)
                    flag = 1;
            }
            else flag = -1;
            return flag;
        }
}
