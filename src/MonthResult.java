
import java.util.Scanner;

class MonthResult
{
    private int id;
    private int income;
    MonthResult()
    {

    }
    MonthResult(int my_id)
    {
        this.id = my_id;
        this.income = 0;
    }
    MonthResult(int my_id, int my_income)
    {
        id = my_id;
        income = my_income;
    }
    void in_month_result()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id:");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input income:");
        this.income = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
    }
    void print_month_result()
    {
        System.out.printf("id = %d\nincome = %d\n", this.id,this.income);
    }
    int compare_month_results(int operation, MonthResult month_result2)
    {
        int flag = 0;
        if (operation == 0) {
            if (this.income < month_result2.income)
                flag = 1;
        }
        else flag = -1;
        return flag;
    }
}