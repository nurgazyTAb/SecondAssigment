import java.util.Scanner;
public class TaskW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minCost = 999999;
        int t1 = 0, t10 = 0, t60 = 0;

        for (int c60 = 0; c60 <= n / 60 + 2; c60++) {
            for (int c10 = 0; c10 <= 10; c10++) {
                int rides = c60 * 60 + c10 * 10;
                int c1 = rides >= n ? 0 : n - rides;

                int cost = c60 * 440 + c10 * 125 + c1 * 15;
                if (cost < minCost) {
                    minCost = cost;
                    t1 = c1;
                    t10 = c10;
                    t60 = c60;
                }
            }
        }
        System.out.println(t1 + " " + t10 + " " + t60);
    }
}