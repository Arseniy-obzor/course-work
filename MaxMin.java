import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число X :");
        int x = scanner.nextInt();

        System.out.println("Введите число Y :");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("Максимальное число: " + x);
            System.out.println("Минимальное число: " + y);
        } else if (y > x) {
            System.out.println("Максимальное число: " + y);
            System.out.println("Минимальное число: " + x);
        } else {
            System.out.println("Числа равны");
        }

    }

}