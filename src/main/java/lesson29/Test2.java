package lesson29;

import lesson10hw.p1.p2.p3.C;

public class Test2 {
    Car c = Car.createCar();
}

class Car {
    private Car() {
    }

    static Car createCar() {
        return new Car();
    }
}
