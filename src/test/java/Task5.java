import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        double[] qulebi = new double[5];
        double[] wonebi = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("შეიყვანეთ ქულა " + (i + 1) + ":");
            qulebi[i] = scanner.nextDouble();
            System.out.println("შეიყვანეთ წონა " + (i + 1) + ":");
            wonebi[i] = scanner.nextDouble();
        }
        double wonebisDaQulebisNamravli = 0;
        double wonebisJami = 0;

        for (int i = 0; i < 5; i++) {
            wonebisDaQulebisNamravli += qulebi[i] * wonebi[i];
            wonebisJami += wonebi[i];
        }
        double shewoniliSashualo = wonebisDaQulebisNamravli / wonebisJami;
        System.out.println("მოცემული რიცხვების შეწონილი საშუალოა " + shewoniliSashualo);

        scanner.close();
    }
}

        /*
        System.out.println("შეიყვანეთ პირველი ქულა:");
        int pirveliQula = scanner.nextInt();
        System.out.println("შეიყვანეთ პირველი წონა:");
        int pirveliWona = scanner.nextInt();

        System.out.println("შეიყვანეთ მეორე ქულა:");
        int meoreQula = scanner.nextInt();
        System.out.println("შეიყვანეთ მეორე წონა:");
        int meoreWona = scanner.nextInt();

        System.out.println("შეიყვანეთ მესამე ქულა:");
        int mesameQula = scanner.nextInt();
        System.out.println("შეიყვანეთ მესამე წონა:");
        int mesameWona = scanner.nextInt();

        System.out.println("შეიყვანეთ მეოთხე ქულა:");
        int meotxeQula = scanner.nextInt();
        System.out.println("შეიყვანეთ მეოთხე წონა:");
        int meotxeWona = scanner.nextInt();

        System.out.println("შეიყვანეთ მეხუთე ქულა:");
        int mexuteQula = scanner.nextInt();
        System.out.println("შეიყვანეთ მეხუთე წონა:");
        int mexuteWona = scanner.nextInt();

        double shewoniliSashualo = (double) (pirveliQula * pirveliWona + meoreQula * meoreWona +
                mesameQula * mesameWona + meotxeQula * meotxeWona + mexuteQula * mexuteWona) /
                (pirveliWona + meoreWona + mesameWona + meotxeWona + mexuteWona);
        System.out.println("მოცემული რიცხვების შეწონილი საშუალოა " + shewoniliSashualo);
        */