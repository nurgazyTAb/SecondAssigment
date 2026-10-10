import java.util.Scanner;
public class TaskZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + " ");

        int lastDigit = n % 10;
        int lastTwoDigits = n % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            System.out.println("bochek");
        } else if (lastDigit == 1) {
            System.out.println("bochka");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println("bochki");
        } else {
            System.out.println("bochek");
        }
    }
}