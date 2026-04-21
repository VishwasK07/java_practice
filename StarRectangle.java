package Pattern_printing;
import java.util.Scanner;
public class StarRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        for(int i = 1;i <= row; i++){
            for(int j = 1;j <=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
