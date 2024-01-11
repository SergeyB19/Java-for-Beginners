package lesson13;

public class Month {
    public static void main(String[] args) {
        numberMonths(6);
    }
    public static void numberMonths(int month) {
        switch (month) {
            case 2:
                System.out.println("Кол-во дней: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Кол-во дней: 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Кол-во дней: 31");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
