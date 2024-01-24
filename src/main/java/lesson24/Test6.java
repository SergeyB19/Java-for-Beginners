package lesson24;

public class Test6 {

}

class AnimalZoo {
    String showName() {
        return "someAnimal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class MouseZoo extends AnimalZoo {
    String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of animal: " + showName());
    }


    public static void main(String[] args) {
        AnimalZoo az = new AnimalZoo();
        az.showInfoAboutAnimal();
        MouseZoo mz = new MouseZoo();
        mz.showInfoAboutMouse();
    }
}
