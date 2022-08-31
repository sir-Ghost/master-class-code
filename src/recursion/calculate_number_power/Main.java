package recursion.calculate_number_power;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.calculate_number_power(-2,1));
    }

    public int calculate_number_power(int number, int power)
    {
        if(power < 0)
            return -1;
        else if(power == 0 || power == 1)
            return number;


        return number * calculate_number_power(number,power-1);
    }
}
