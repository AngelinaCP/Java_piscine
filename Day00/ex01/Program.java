package Day00.ex00;
import java.util.*;
import java.lang.*;

public class Program {
    public static boolean isPrime(int num) {
        int exit_code;
        int count = 0;

        if (num <= 1) {
            System.err.println("Illegal argument");
            System.exit (-1);
        }
        if (num % 2 == 0 && num > 2) {
            count++;
            System.out.println("false " + count);
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("false " + count);
                return false;
            }
            count++;
        }
        count++;
        System.out.println("true " + count);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        isPrime(num);
    }
}