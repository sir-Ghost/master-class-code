package array.max_product;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int arr[] = {10,20,30,90,50,60};
        System.out.println(main.max_products(arr));

    }

    public String max_products(int[] arr)
    {
        int maxProduct = 0;
        String pairs = "";
        for(int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i]*arr[j] > maxProduct)
                {
                    maxProduct = arr[i]*arr[j];
                    pairs = Integer.toString(arr[i])+ "," + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }
}
