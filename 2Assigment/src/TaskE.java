import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        if (dx * dy == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}