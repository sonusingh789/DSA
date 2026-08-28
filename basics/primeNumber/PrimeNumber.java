import java.text.NumberFormat.Style;

public class PrimeNumber {

    static boolean prime(int n) {
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
            return isPrime;
        }
        if (n == 2) {
            return isPrime;
        } else if (n % 2 == 0) {
            isPrime = false;
            return isPrime;
        } else {
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0)
                    return false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.print(prime(40587453));
    }

}
