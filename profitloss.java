package If_Else;

import java.util.Scanner;

public class profitloss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.print("Your Profit is: ");
            int profit = sp-cp;
            System.out.println(profit);
        } else {
            System.out.print("Your loss is: ");
            int loss = cp-sp;
            System.out.println(loss);
        }
    }
}
