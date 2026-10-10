import java.util.Scanner;
public class TaskAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        String[] t = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] u = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        System.out.println(t[x / 10] + u[x % 10]);
    }
}