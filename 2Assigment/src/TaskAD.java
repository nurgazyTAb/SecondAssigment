import java.util.Scanner;
public class TaskAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int systemAnswer = scanner.nextInt();
        int studentAnswer = scanner.nextInt();

        if (systemAnswer == studentAnswer || (systemAnswer != 1 && studentAnswer != 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}