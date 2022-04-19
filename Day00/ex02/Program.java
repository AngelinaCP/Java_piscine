import java.util.*;

public class Program {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            System.out.println("Illegal argument");
            System.exit (-1);
        }
        if (num % 2 == 0 && num > 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        System.out.println("COU");
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int i;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();

        while (num != 42) {
            while (num > 10) {
                sum += num % 10;
                num /= 10;
            }
            sum += num;
            if (isPrime(sum) == true)
                count ++;
            num = scanner.nextInt();
        }
        System.out.println("Count of coffee-request - " + count);
    }
}