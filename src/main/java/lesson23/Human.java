package lesson23;

public class Human {
    /* public Human(String name) {
         name = name;
     }*/
    public String name = "Kolya";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
    public static int salary = 150;

    public void work() {
        System.out.println("Work");
    }

    public static void rest() {
        System.out.println("Rest");
    }
}

