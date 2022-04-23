
package Day00.ex03;
import java.util.*;


//hasNext with scanner

public class Program {
    public static void main(String[] args) {
        int stop_num = 0;
        int num_week = 1;
        long all_grades = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int week = scanner.nextInt();
        if (!str.equals("Week") && num_week != week) {
            ft_error();
        }
        all_grades = get_marks(str, week, num_week, all_grades, scanner);
        printing(all_grades);

    }

    public static long get_marks(String str, int week, int num_week, long all_grades, Scanner scanner) {
        while (!str.equals("42") || week != 42) {
            if (week <= 18) {
                if (str.equals("Week") && num_week == week) {
                    all_grades = find_value(all_grades, week, scanner);
                    num_week++;
                }
                else {
                    ft_error();
                }
                str = scanner.next();
                if (str.equals("42"))
                    break ;
                week = scanner.nextInt();
            }
            else {
                break ;
            }
        }
        return all_grades;
    }

    public static void ft_error() {
        System.err.println("Illegal argument");
        System.exit(-1);
    }

    public static long find_value(long all_grades, int week, Scanner scanner) {
        int k;
        int grade = scanner.nextInt();
        int min = grade;

        for (k = 0; k < 4; k++) {
            if (grade > 9 || grade < 1) {
                System.err.println("Illegal argument");
                System.exit(-1);
            }
            grade = scanner.nextInt();
            if (min > grade) {
                min = grade;
            }
        }
        long value = min;
        for (int i = 0; i < week; i++) {
            value *= 10;
        }
        all_grades += value;
        return all_grades;
    }

    public static void printing(long all_grades) {
        int digit;
        int j = 1;
        all_grades /= 10;
        while (all_grades != 0) {
            System.out.print("Week ");
            System.out.print(j);
            System.out.print(" ");
            digit = (int)(all_grades % 10);
            for (int k = 0; k < digit; k++) {
                System.out.print("=");
            }
            System.out.println(">");
            all_grades /= 10;
            j++;
        }
    }
}