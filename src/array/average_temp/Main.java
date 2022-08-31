package array.average_temp;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        int[] arr = null;
        int days = 0;
        int sum_of_temperature=0;
        float average_temp = 0;
        int days_above_avg=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperature");
        days = sc.nextInt();
        arr = new int[days];

        //take input
        for(int row=0; row<arr.length; row++)
        {
            System.out.println("Day "+(row+1)+"'s high temperature ");
            arr[row] = sc.nextInt();
            sum_of_temperature += arr[row];
        }

        average_temp = sum_of_temperature / days;

        for (int above = 0; above<arr.length; above++)
        {
            if (arr[above] > average_temp )
                days_above_avg++;
        }

        System.out.println("Average Temperature : "+average_temp);
        System.out.println("Day's above Average Temperature : "+days_above_avg);
    }
}
