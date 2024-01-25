package lesson25.homework;

public class Main {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        Pingvin pingvin = new Pingvin("Pingvin");
        pingvin.speak();
        Animal lev = new Lev("Lev");
        lev.eat();
        lev.sleep();
        Mammal lev1 = new Lev("Lev1");
        lev1.eat();
        lev1.sleep();
        lev1.run();
        lev1.speak();
    }
}
