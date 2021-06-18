import java.util.Scanner;

public class probeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число :");
        int a = scanner.nextInt();

        if (a % 2 > 0) {
            System.out.println("число нечетное");
        } else
            System.out.println(" число четное");
            ;
            }
       // } else if (a == 0) {
       // System.out.println(" число равно 0");

    }

