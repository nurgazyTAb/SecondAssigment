import java.util.Scanner;
public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
        } else {
            if (a > b) { int temp = a; a = b; b = temp; }
            if (b > c) { int temp = b; b = c; c = temp; }
            if (a > b) { int temp = a; a = b; b = temp; }
            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;
            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + b2 > c2) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}