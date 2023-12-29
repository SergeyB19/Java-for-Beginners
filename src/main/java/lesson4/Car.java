package lesson4;

import java.util.Arrays;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a;
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3;
        car1.color = "black";
        car1.engine = "V8";

        System.out.println(car2.engine);
        System.out.println(new Car().color);
//        System.out.print("Цвет = " );
        System.out.println("Цвет: " + car1.color);
//        System.out.print("Мотор = " );
        System.out.println("Мотор: " + car1.engine);
    }
}
