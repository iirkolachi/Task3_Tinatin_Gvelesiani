import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ პირველი რიცხვი:");
            int x = scanner.nextInt();
            System.out.println("შეიყვანეთ მოქმედება:");
            String moqmedeba = scanner.next();
            System.out.println("შეიყვანეთ მეორე რიცხვი:");
            int y = scanner.nextInt();

            System.out.println("შედეგი:");
            if (moqmedeba.equals("+")) {
                System.out.println(x + y);
            } else if (moqmedeba.equals("-")) {
                System.out.println(x - y);
            } else if (moqmedeba.equals("*")) {
                System.out.println(x * y);
            } else if (moqmedeba.equals("/") && y == 0) {
                System.out.println("ნულზე გაყოფა არ შეიძლება!");
            } else if (moqmedeba.equals("/")) {
                System.out.println(x / y);
            } else {
                System.out.println("დაუშვებელი მოქმედება!");
            }
        } catch (Exception e) {
            System.out.println("შეცდომა!");
        } finally {
            scanner.close();
        }

    }
}
