package lesson28.homeworkCorrect;

class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Tiger {
    public void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + eda);
        }
        System.out.println("Tigr est myaso");
    }

    public void drink(String jidkost) throws NeVodaException {
        if (!jidkost.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + jidkost);
        }
        System.out.println("Tigr pyet vodu");
    }

}
