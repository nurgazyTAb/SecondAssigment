import java.util.Scanner;
public class TestX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int t1 = 0, t5 = 0, t10 = 0, t20 = 0, t60 = 0;
        if (n <= 0) {
        } else if (n <= 2) {
            t1 = n;
        } else if (n <= 5) {
            if (n * 15 <= 70) {
                t1 = n;
            } else {
                t5 = 1;
            }
        } else {
            t60 = n / 60;
            int rem = n % 60;
            if (rem > 0) {
                if (rem <= 5) {
                    if (rem * 15 <= 70) t1 = rem;
                    else t5 = 1;
                } else if (rem <= 10) {
                    if (rem * 15 <= 125 && rem * 15 <= 75) t1 = rem;
                    else if (70 + (rem - 5) * 15 <= 125 && 70 + (rem - 5) * 15 <= 70) {
                        t5 = 1;
                        t1 = rem - 5;
                    } else {
                        t10 = 1;
                    }
                } else {
                }
            }
        }
        System.out.println(t1 + " " + t5 + " " + t10 + " " + t20 + " " + t60);
    }
}