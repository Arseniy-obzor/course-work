public class Circle {
    public static void main(String[] args) {
        double radius = 10;
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длина окружности равна: " + circumference);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь окружности: " + area);

        radius = Math.sqrt(area / Math.PI);
        System.out.println("Радиус окружности равен: " + radius);

        int sectorAngle = 30;
        double sectorArea = Math.PI * Math.pow(radius, 2) * sectorAngle / 360;
        System.out.println("Площадь сектора: " + sectorArea);
        System.out.println("Решение завершено.");
    }
}

