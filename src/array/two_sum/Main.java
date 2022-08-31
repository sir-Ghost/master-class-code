package array.two_sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {0,11,9,15};
        System.out.println(Arrays.toString(main.two_sum(arr,9)));
    }

    public int[] two_sum(int[] arr, int target)
    {
        int sum=0;

        for(int row=0; row<arr.length; row++)
        {
            for(int col=row+1; col<arr.length; col++)
            {
                sum = arr[row] + arr[col];
                if (sum == target)
                    return new int[] {row,col};
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}
