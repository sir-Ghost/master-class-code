package array.matrix_rotation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Main main = new Main();
        System.out.println(Arrays.deepToString(arr));
        //rotate matrix
        main.rotateMatrix(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public boolean rotateMatrix(int[][] matrix)
    {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;

        int n = matrix.length;
        for (int layer=0; layer<n/2; layer++)
        {
            int first = layer;
            int last = n - 1 - layer;
            for(int cell=first; cell<last; cell++)
            {
                int offset = cell-first;
                int top = matrix[first][cell];
                matrix[first][cell] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[cell][last];
                matrix[cell][last] = top;
            }
        }
        return true;
    }
}

