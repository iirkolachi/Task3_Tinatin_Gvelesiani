import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ თქვენი თანხა (დოლარში):");
            double usd = scanner.nextDouble();
            if (usd < 0) {
                throw new IllegalArgumentException("თქვენ მიერ შეყვანილი თანხა უნდა იყოს ნულზე მეტი!");
            }
            double procenti = 5;
            double exchangeRate = 0.91;
            double eu = usd * exchangeRate * (1 - procenti / 100);
            System.out.println("თქვენ მიიღებთ " + eu + " ევროს");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("შეიყვანეთ მხოლოდ ციფრები!");
        } finally {
            scanner.close();
        }
    }
}
