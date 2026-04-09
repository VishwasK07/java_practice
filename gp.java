package Loops;
import java.util.Scanner;
public class gp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, r = 2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *=r;
        }
    }
}
