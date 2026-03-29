package If_Else;

import java.util.Scanner;

public class divisibleby5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("The number you entered is divisible by 5");
        } else {
            System.out.println("The number you entered is not divisible by 5");
        }
    }
}

