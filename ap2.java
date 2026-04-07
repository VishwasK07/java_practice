package Loops;
import java.util.Scanner;
public class ap2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, d = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
