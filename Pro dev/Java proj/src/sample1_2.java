import java.util.Scanner;
public class sample1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0 , b = 0;
        double y;

        System.out.print("Emter value a : ");
        a= scan.nextInt();
       System.out.print("Emter value b : ");
       b= scan.nextInt();

       System.out.println("When a = " + a + ",b = " + b + '\n');
       //1
       y = (a-b) * (a+b);
       System.out.println("y = (a-b) * (a+b) =" + y );
       //2
       y =3 * (a-b) * (a+b) - 6 ;
       System.out.println("y = 3 *  ((a-b) * (a+b)) - 6 =" + y );
       //3
       y =3 - (2 * a) / (3*b)  ;
       System.out.println("y = 1 - (2*a) / (3*b) =" + y );
    }   
    
}
