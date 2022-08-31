package array.one_dimension;

public class SingleDimensionArray {

    int array[] = null;
    public SingleDimensionArray(int size)
    {
        array = new int[size];
        //set default value
        for(int i=0; i<array.length; i++)
        {
            array[i] = Integer.MIN_VALUE; // MIN_VALUE = -2^31
        }
    }

    // Insert
    public void insert(int index, int value)
    {
        try {
            if (array[index] == Integer.MIN_VALUE)
            {
                array[index] = value;
                System.out.println("Value Inserted Successfully");
            }
            else
                System.out.println("This cell is already occupied");

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }

    public void traversalArray()
    {
        try {
            for (int i=0; i<array.length; i++)
                System.out.println("Traversing "+array[i]+" ");

        }catch (Exception e)
        {
            System.out.println("Array no longer exist");
        }
    }

    public void searchArray(int search_value)
    {
        for (int i=0; i<array.length; i++)
        {
            if (array[i] == search_value)
            {
                System.out.println("Value found on Index : "+ i);
                return;
            }
        }
        System.out.println("Not match found");
    }

    public void deleteElement(int delete_value)
    {
        for (int i=0; i<array.length; i++)
        {
            if (array[i] == delete_value)
            {
                array[i] = Integer.MIN_VALUE;
                System.out.println("Deleted Successfully");
                return;
            }
        }
        System.out.println("No match found");
    }

}
