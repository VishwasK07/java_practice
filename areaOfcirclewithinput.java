package Basics;
import  java.util.Scanner;


public class areaOfcirclewithinput {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        double a=3.14*r*r;
        System.out.println("The Area of Circle is "+a);

    }
}
