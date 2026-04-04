package If_Else;
import java.util.Scanner;
public class nestedthreeorfivebutnotfifteen {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if((n%5==0 || n%3==0) && n%15!=0) {
            System.out.println("The number is divisible by 3 or 5 but not 15");
        }
        else{
            System.out.println("Not matching the required condition");
        }
    }
}
