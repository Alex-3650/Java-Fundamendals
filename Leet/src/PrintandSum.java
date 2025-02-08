import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int sum=0;
        sum = getSum(num1, num2, sum);
        System.out.println(" ");
        System.out.println(sum);


    }

    private static int getSum(int num1, int num2, int sum) {
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
            sum +=i;
        }
        return sum;
    }
}
