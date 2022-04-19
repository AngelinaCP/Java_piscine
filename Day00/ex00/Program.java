import java.util.*;

public class Program {
    static int sum;

    public static void main(String[] args) {
        int num  = 123456;
        int sum = 0;

        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num;
        System.out.println(sum);
    }
}