package lesson4;

import java.util.Arrays;

public class Car {
    String color;

    String engine;

//    Car(String cvet, String motor) {
//        color = cvet;
//        engine = motor;
//    }

    Car(String cvet, String motor) {
        System.out.println("Object is created!!!");
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }

    Car() {
        color = "blue";
        engine = "V12";
    }

}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "V8");
        Car car2 = new Car("white", "V6");
        System.out.println(car1.color);
        System.out.println(car1.engine);
        car2.color = "red";
        car2.engine = "V5";
        System.out.println(car2.color);
        System.out.println(car2.engine);
//        int a;
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3;
//        car1.color = "black";
//        car1.engine = "V8";
//
//        System.out.println(car2.engine);
//        System.out.println(new Car().color);
////        System.out.print("Цвет = " );
//        System.out.println("Цвет: " + car1.color);
////        System.out.print("Мотор = " );
//        System.out.println("Мотор: " + car1.engine);
    }
}
