import java.util.Scanner;

public class triangle {
    static int function(int a, int b, int c) {
        int p = a + b + c;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("Введите размеры сторон треугольника : ");
        System.out.println("a=");
        a = sc.nextInt();
        System.out.println("b=");
        b = sc.nextInt();
        System.out.println("c=");
        c = sc.nextInt();
        System.out.println("Периметр равен : " + function(a, b, c));
    }
}
