import java.util.HashMap;
import java.util.Scanner;

public class PO3RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(romanToInt(text));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int prevValue=0;

        HashMap <Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);


        for (int i = s.length()-1; i >=0 ; i--) {
            int currentValue=romanMap.get(s.charAt(i));
            if (currentValue>=prevValue){
                sum+=currentValue;
            }else{
                sum-=currentValue;
            }

            prevValue=currentValue;
        }
        return  sum;
    }
}
