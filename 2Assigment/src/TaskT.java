import java.util.Scanner;
public class TaskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            if (x1 == (int) x1) System.out.print((int) x1); else System.out.print(x1);
            System.out.print(" ");
            if (x2 == (int) x2) System.out.print((int) x2); else System.out.print(x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            if (x == -0.0) x = 0.0;

            if (x == (int) x) {
                System.out.println((int) x);
            } else {
                System.out.println(x);
            }
        }
    }
}