import java.util.Arrays;

public class PO7SingleNumber {
    public static void main(String[] args) {
       int [] arr=new int[]{1,5,4,5,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
