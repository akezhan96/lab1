import java.util.Arrays;
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


        int[] nums = {2,7,11,15};
        int target = 9;
        int[] sum = nums;
        int ans1, ans2;
        int flag;
        Arrays.sort(sum);
        int x,y,mid;
        for (int i = 0; i < sum.length; i++){
            x = i+1;
            y = sum.length;
            flag = 0;
            while (x <= y){
                mid = (x+y)/2;
                if (sum[x] + sum[y] > target) x = mid+1;
                else
                if (sum[x] + sum[y] < target) y = mid-1;
                else
                if (sum[x] + sum[y] == target) {
                    ans1 = sum[x];
                    ans2 = sum[y];
                    flag = 1;
                    break;
                }
            }
            if (flag==1) break;
        }
        int posi = 1231231;
        int posj = 1231231;
        for (int i = 0; i < sum.length; i++){
            if (ans1 == nums[i] && posi != 1231231) {posi = i;}
            if (ans2 == nums[i] && posj != 1231231) {posj = i;}
        }
        System.out.println(posi + " " + posj);

    }


}
