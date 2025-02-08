import java.util.Scanner;

public class PO6ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=5;
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n) {
      if (n==1){
          return 1;
      }
      if (n==2){
          return 2;
      }
      int a=1;
      int b=2;
       int c=0;
        for (int i = 3; i <=n ; i++) {

            c=a+b;
            a=b;
            b=c;

        }
        return b;
    }
}
