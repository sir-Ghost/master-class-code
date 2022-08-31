package array.one_dimension;

public class Main {
    public static void main(String[] args)
    {
        SingleDimensionArray sda = new SingleDimensionArray(5);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
        sda.insert(3,40);
        sda.insert(4,50);

//        sda.traversalArray();
//        sda.searchArray(306);

        sda.deleteElement(40);
    }

}
