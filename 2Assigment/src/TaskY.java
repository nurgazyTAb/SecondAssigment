import java.util.Scanner;
public class TaskY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 1) System.out.println((x - 1) + " " + y);
        if (y > 1) System.out.println(x + " " + (y - 1));
        if (x < m) System.out.println((x + 1) + " " + y);
        if (y < n) System.out.println(x + " " + (y + 1));
    }
}