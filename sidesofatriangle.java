package If_Else;

import java.util.Scanner;

public class sidesofatriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = sc.nextInt();
        System.out.println("Enter second side: ");
        int b = sc.nextInt();
        System.out.println("Enter third side: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
