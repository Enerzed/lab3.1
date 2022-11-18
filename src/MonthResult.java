
import java.util.*;

class MonthResult
{
    private static int Count = 0;
    private int id;
    private int income;
    public MonthResult()
    {
        Count++;
        this.id = Count;
    }
    public MonthResult(int my_income)
    {
        this.income = my_income;
        Count++;
        this.id = Count;
    }
    public void in_month_result()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input income:");
        this.income = Integer.parseInt(scanner.nextLine());
        //scanner.close();
    }
    public void print_month_result()
    {
        System.out.printf("id = %d\nincome = %d\n", this.id,this.income);
    }
    public int compare_month_results(int operation, MonthResult month_result2)
    {
        int flag = 0;
        if (operation == 0) {
            if (this.income < month_result2.income)
                flag = 1;
        }
        else flag = -1;
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
    public int GetIncome()
    {
        return this.income;
    }
    public void SetIncome(int my_income)
    {
        this.income = my_income;
    }
}