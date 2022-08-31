package recursion.convert_decimal_to_binary;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.convert_decimal_to_binary(13));
    }

    private int convert_decimal_to_binary(int num)
    {
        if (num == 0)
            return 0;
        else if(num < 0)
            return -1;

        return num%2 + 10 * convert_decimal_to_binary(num/2);
    }
}
