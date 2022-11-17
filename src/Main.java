import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("sum is " + (a+b));
        System.out.println("multiplication is " + (a*b));
        System.out.println("reminder is " + (a%b));

        if(a > b){
            System.out.println("a > b");
        }
        else if (a < b){
            System.out.println("a < b");
        } else System.out.println("a == b");

        c = sc.nextInt();
        System.out.println("c is " + c);
        System.out.println("result of exp  " + ((a*a) + b - c / 2));
        System.out.println("area of square  " + (a*a));
        System.out.println("area of circle  " + (3.14 * (a*a)));
        System.out.println("area of cylinder  " + (2*3.14 * (a*a)));
        System.out.println("result of quadrant exp through descriminant  " + ((a-2*b)*a)/(-2*b));



    }


}
