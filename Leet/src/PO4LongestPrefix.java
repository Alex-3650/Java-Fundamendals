import java.util.Scanner;

public class PO4LongestPrefix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] arr=new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));

    }
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return " ";
        }

       String smallest=strs[0];
        for (String str:strs){

            if (str.length()<smallest.length()){
                smallest=str;
            }

        }
        StringBuilder prefix=new StringBuilder();

        for (int i = 0; i < smallest.length(); i++) {
            char currentChar=smallest.charAt(i);


            for (String str : strs) {

                if (currentChar != str.charAt(i)) {
                    return prefix.toString();
                }

            }
            prefix.append(currentChar);

        }
        return prefix.toString();

    }
}
