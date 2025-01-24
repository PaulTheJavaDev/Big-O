import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static long factorial() {

        System.out.println("Enter a number to be factorial.");
        long n = scanner.nextLong();

        if (n == 0 || n == 1) {
            return 1;
        }

        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factorial());
    }
}
