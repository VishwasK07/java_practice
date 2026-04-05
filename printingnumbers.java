package Loops;
import java.util.Scanner;

public class printingnumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int num = 1;num <= n; num +=1){
            System.out.println(num);

        }
    }
}
