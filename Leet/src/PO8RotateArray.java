import java.util.Arrays;
import java.util.Scanner;

public class PO8RotateArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int[] arr=new int[]{1,2,3,4,5,6,7};
        int k=3;
         rotate(arr,k);

    }
    public static void rotate(int[] nums, int k) {

        for (int i = 0; i <k ; i++) {
      int first=nums[nums.length-1];
            for (int j = nums.length-1; j >0 ; j--) {
                nums[j]=nums[j-1];

            }
            nums[0]=first;


        }
        System.out.println(Arrays.toString(nums));
    }
}
