import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int totalCost = a * 100 + b;
        int totalPayment = c * 100 + d;
        int changeInKopeeks = totalPayment - totalCost;
        int e = changeInKopeeks / 100;
        int f = changeInKopeeks % 100;

        System.out.println(e + " " + f);
    }
}