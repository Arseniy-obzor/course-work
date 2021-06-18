import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1:");
        int number1 = scanner.nextInt();

        System.out.println("Введите число 2:");
        int number2 = scanner.nextInt();

        System.out.println("Вы ввели:" + (number1 + number2));

    }
}
