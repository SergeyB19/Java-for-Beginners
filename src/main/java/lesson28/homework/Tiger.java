package lesson28.homework;

public class Tiger {
    void eat(String s) {
        if (!s.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + s);
        } else {
            System.out.println("Tigr est myaso");
        }
    }

    void drink(String s) throws NeVodaException {
        if (!s.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + s);
        } else {
            System.out.println("Tigr pyet vodu");
        }
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException " + e);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        } finally {
            System.out.println("eto inner finally block");
        }
        try {
            tiger.drink("pivo");

        } catch (NeVodaException e) {
            System.out.println("NeVodaException " + e);
        } finally {
            System.out.println("eto outer finally block");
        }
    }
}
