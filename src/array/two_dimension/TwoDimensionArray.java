package array.two_dimension;

public class TwoDimensionArray {

    int arr[][] = null;

    public TwoDimensionArray(int arr_row, int arr_col)
    {
        this.arr = new int[arr_row][arr_col];
        //set default value
        for(int row=0; row<arr.length; row++)
        {
            for(int col = 0; col <arr.length; col++)
            {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value)
    {
        try{
            if(arr[row][col] == Integer.MIN_VALUE)
            {
                arr[row][col] = value;
                System.out.println("Inserted Successfully");
            }
            else
                System.out.println("Cell is not empty");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }

    public void accessCell(int row, int col)
    {
        try{
            if (arr[row][col] != Integer.MIN_VALUE)
                System.out.println(arr[row][col]);
            else
                System.out.println("Cell is empty");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }

    public void arrayaTraversal()
    {
        for(int row=0; row< arr.length; row++)
        {
            for(int col=0; col<arr.length; col++)
                System.out.print(arr[row][col]+" ");
        }
    }

    public void deleteElement(int value)
    {
        for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col< arr.length; col++)
            {
                if (arr[row][col] == value)
                {
                    arr[row][col] = Integer.MIN_VALUE;
                    System.out.println("Deleted Successfully");
                }
            }
        }
    }


}
