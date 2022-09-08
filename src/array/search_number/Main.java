package array.search_number;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {2,5,7,9,4,8};
        main.search(arr,9);
    }

    public void search(int[] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            if (arr[row] == target) {
                System.out.println("Found element " + target + " on Index : " + row);
                return;
            }
        }

        System.out.println(target + " Not Found");

    }
}
