package lesson8;

public class HomeWork {
    public static final double p = 3.14;


    double areaOfaCircle(double radius) {
        double result = (p * radius * radius);
        System.out.print("Площадь круга равна: " + result);
        return result;
    }

    public static double circumFerence(double radius) {
        double result = 2 * p * radius;
        System.out.print("Длина окружности: " + result);
        return result;
    }

    double radius(double radius) {
        System.out.println("Радиус = " + radius);
        areaOfaCircle(radius);
        System.out.println();
        circumFerence(radius);

        return radius;
    }


    public static double multiplication(double a, double b, double c) {
        double result = a * b * c;
        System.out.print("Результат умножения: ");
        return result;
    }

    public static void division(double a, double b) {
        System.out.println("Результат деления: " + a / b + "; Остаток от деления " + a % b);
    }
}

class HomeWorkTest {
    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        System.out.println(hw.multiplication(5, 5, 5));
        System.out.println(hw.multiplication(12, 4, 9));
        hw.division(5, 7);
        hw.division(7, 2);

        hw.areaOfaCircle(1.5);
        System.out.println();
        hw.circumFerence(1.5);
        System.out.println();
        System.out.println("----------------");
        hw.radius(1.0);
    }
}
