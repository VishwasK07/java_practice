package Basics;
import java.util.Scanner;
public class findingRemainder {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter divisior: ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("The remainder when "+a+" is divided by "+b+" is "+r);
    }
}
