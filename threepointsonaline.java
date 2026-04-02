package If_Else;

public class threepointsonaline {
    static void main() {
        double x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;
        double m1=(y2-y1)/(x2-x1);
        double m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("three points lie on a same line");
        }
        else{
            System.out.println("three points do not lie on a same line");
        }
    }
}
