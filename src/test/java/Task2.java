import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ კონუსის რადიუსი:");
            double r = scanner.nextDouble();
            System.out.println("შეიყვანეთ კონუსის სიმაღლე:");
            double h = scanner.nextDouble();
            System.out.println("შეიყვანეთ კონუსის დახრილი სიმაღლე:");
            double s = scanner.nextDouble();

            double surfaceArea = Math.PI * r * (r + s);
            double volume = (Math.PI * Math.pow(r, 2) * h) / 3;
            System.out.println("კონუსის ფართობია " + surfaceArea);
            System.out.println("კონუსის მოცულობაა " + volume);

        } catch (Exception e) {
        System.out.println("შეცდომა: შეიყვანეთ მხოლოდ ციფრები!");
        } finally {
            scanner.close();
        }
    }
}
