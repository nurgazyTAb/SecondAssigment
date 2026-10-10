import java.util.Scanner;
public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(n + " ");

        int lastDigit = n % 10;
        int lastTwoDigits = n % 100;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            System.out.println("korov");
        } else if (lastDigit == 1) {
            System.out.println("korova");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println("korovy");
        } else {
            System.out.println("korov");
        }
    }
}