package lesson23;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        name = String.valueOf(s);
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya"));
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName().append("!!!"));
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());

    }
}
