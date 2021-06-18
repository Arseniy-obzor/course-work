public class rectangle {
    {

    }
        private double width; // ширина прямоугольника
        private double length; // длина прямоугольника

        // создание прямоугольника с заданной шириной и длиной
        public rectangle (double width, double length) {
            this.width = width;
            this.length = length;
        }
        // площадь
        public double getArea() {
            return width*length;
        }
        public static void main(String[] args) {
            rectangle r = new rectangle (5.7,4.6);
            System.out.println (r.getArea());
        }
}
