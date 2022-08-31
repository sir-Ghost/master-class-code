package time_complexity;

public class Sum_And_Product {
    public static void main(String[] args) {
        Sum_And_Product sp = new Sum_And_Product();
        int[] array = {1,3,4,5};
        sp.sum_and_product_of_array(array);
    }

    public void sum_and_product_of_array(int[] array)
    {
        int sum = 0; // ---------------------- O(1)
        int product = 1; // ---------------------- O(1)

        for(int i=0; i<array.length; i++) // ---------------------- O(N)
        {
            sum += array[i]; // ---------------------- O(1)
            product *= array[i]; // ---------------------- O(1)
        }

        System.out.println("Sum "+sum); // ---------------------- O(1)
        System.out.println("Product "+product); // ---------------------- O(1)

    }
}
