package array.permutation;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {6,5,4,1,2,3};

        Main main = new Main();
        System.out.println("Permutation : "+main.permutation(arr1,arr2));
    }

    public boolean permutation(int[] arr1, int[] arr2)
    {
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 0;
        int mul2 = 0;

        if (arr1.length != arr2.length)
            return false;

        for (int i=0; i<arr1.length; i++)
        {
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }

        if (sum1 == sum2 && mul1 == mul2)
            return true;

        return false;
    }
}
