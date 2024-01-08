package lesson11;

public class Car {
    String color;
    String engine;
    int countDoor;

    public Car(String color, String engine, int countDoor) {
        this.color = color;
        this.engine = engine;
        this.countDoor = countDoor;
    }

    public void changeCountDoor(int c) {
        countDoor = c;
    }

    public static void changeColor(Car c1, Car c2) {
        String c3= c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }
}


class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Yellow", "V8", 4);
        Car car2 = new Car("Red", "V12", 3);
        car1.changeCountDoor(8);
        System.out.println(car1.countDoor);
        car2.changeColor(car1,car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
