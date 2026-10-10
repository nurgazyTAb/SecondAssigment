import java.util.Scanner;
public class TaskAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int evenCount = 0;
        if (a % 2 == 0) evenCount++;
        if (b % 2 == 0) evenCount++;
        if (c % 2 == 0) evenCount++;
        if (evenCount > 0 && evenCount < 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}