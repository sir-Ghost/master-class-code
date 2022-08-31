package recursion.factorial;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.factorial(5));
    }

    private int factorial(int number)
    {
        if (number == 0)
            return 1;
        else if (number < 0)
            return  -1;

        return number * factorial(number-1);
    }
}
