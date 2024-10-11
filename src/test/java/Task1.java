import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); {
        try {
            System.out.println("შეიყვანეთ a: ");
            float a = scanner.nextFloat();
            if (a == 0) {
                throw new IllegalArgumentException("a უნდა იყოს ნულისგან განსხვავებული!");
            }
            System.out.println("შეიყვანეთ b: ");
            float b = scanner.nextFloat();
            if (b == 0) {
                throw new IllegalArgumentException("b უნდა იყოს ნულისგან განსხვავებული!");
            }
            System.out.println("შეიყვანეთ c: ");
            float c = scanner.nextFloat();
            if (c < 0) {
                throw new IllegalArgumentException("c უნდა იყოს ნულის ტოლი ან მასზე მეტი!");
            }

            float x = (float) (Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c)) / (a * b + c);

            System.out.println("შედეგი: " + x);
        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("შეცდომა: შეიყვანეთ სწორი სიმბოლო!");
        } finally {
            scanner.close();
        }
            }
        }
    }
