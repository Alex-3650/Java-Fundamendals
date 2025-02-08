import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        if (num%10==0) {
            System.out.println(10);
        }
        else if(num%7==0){
            System.out.println(7);
            }
        else if(num%6==0){
            System.out.println(6);
        }
        else if(num%3==0){
            System.out.println(3);
        }
        else if(num%2==0){
            System.out.println(2);
        }
        else{
            System.out.println("Now divisible");
        }
    }
}
