package recursion.sum_of_integer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sum_of_integer_numbers(324));
    }

    public int sum_of_integer_numbers(int n)
    {
        if(n == 0 || n < 0)
            return 0;

        return n%10+sum_of_integer_numbers(n/10);
    }
}
