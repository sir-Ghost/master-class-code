package recursion.greatest_common_divisor;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.greatest_common_divisor(48,0));
    }

    /* Euclidean Algorithm
        gcd(a,0) = a;
        gcd(a,b) = gcd(b,a%b);
     */
    private int greatest_common_divisor(int a, int b) {

        if (a < 0 || b < 0)
            return -1;

        if (b == 0)
            return a;

        return greatest_common_divisor(b,a%b);
    }
}
