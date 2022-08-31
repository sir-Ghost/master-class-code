package array.two_dimension;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionArray tda = new TwoDimensionArray(3,3);
        tda.insert(0,0,10);
        tda.insert(0,1,40);
        tda.insert(0,2,50);
        tda.insert(1,0,100);
        tda.insert(1,1,300);
        tda.insert(1,2,500);
        tda.insert(2,0,1000);
        tda.insert(2,1,2000);
        tda.insert(2,2,4000);

//      System.out.println(Arrays.deepToString(tda.arr));
//      tda.accessCell(1,2);
//        tda.deleteElement(500);
//        tda.arrayaTraversal();

    }
}
