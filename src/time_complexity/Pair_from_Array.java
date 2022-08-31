package time_complexity;

public class Pair_from_Array {
    public static void main(String[] args) {
        Pair_from_Array pa = new Pair_from_Array();
        int[] array = {1,3,4,5};
        pa.pair_from_array(array);
    }

    public void pair_from_array(int[] array)
    {
        for(int row=0; row<array.length; row++) //-----------------O(N)
        {
            for (int col=0; col<array.length; col++) //-----------------O(N)
            {
                System.out.println(array[row]+","+array[col]); //-----------------O(1)
            }
        }
    }

}

