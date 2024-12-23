import java.util.Scanner;

public class Main {

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to get fibonacci result: ");
        int number = scanner.nextInt();
        int result = fibo(number);

        System.out.printf("Fibonacci (%d) is: %d", number, result);
    }
}