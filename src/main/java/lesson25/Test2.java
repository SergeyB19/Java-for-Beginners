package lesson25;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat(4);
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}

abstract class Figura {
    public Figura(int kolichestvoStoron) {
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }

}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public Kvadrat(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + kolichestvoStoron * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }

}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public Pryamougolnik(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }

    public void perimetr() {
        System.out.println("Perimetr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1 * storona2);
    }

}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;

    public Okrujnost(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }

    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }

}

abstract class Chetirexugolnik extends Figura {
    public Chetirexugolnik(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }

    void def() {
        System.out.println("Eto chetirexugolnik");
    }
}
