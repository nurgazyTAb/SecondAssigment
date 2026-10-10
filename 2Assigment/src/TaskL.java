import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int totalTime;
        if (n <= k) {
            totalTime = 2 * m;
        } else {
            totalTime = ((2 * n + k - 1) / k) * m;
        }
        System.out.println(totalTime);
    }
}