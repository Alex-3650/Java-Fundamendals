import java.util.Scanner;

public class PO1Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(isPalindrome(1000000001));
    }
    public static boolean isPalindrome(long x) {
     long num=0;
      long x2=x;
        while(x>0){
           num=(num+x%10) *10;

            x/=10;
        }
        return x2==num/10;
    }
}
