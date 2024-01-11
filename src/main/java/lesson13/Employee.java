package lesson13;

public class Employee {
    public static void main(String[] args) {
        int denNedeli=3;
        int a = 1;
        int b = 2;

        switch (denNedeli) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
            System.out.println("Работа до 18.00");
                break;
            case 6:
            System.out.println("Работа до 14.00");
                break;
            case 7 :
            System.out.println("Работы нет");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
