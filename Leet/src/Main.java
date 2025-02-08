import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums= new int []{2,5,5,11};
        int target=10;

        System.out.println((Arrays.toString(twoSum(nums, target))));

    }
    public  static int[] twoSum(int[] nums, int target) {

        int combination = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i!=j) {
                    combination = nums[i] + nums[j];
                }
                if (combination == target) {
                    return new int[]{i,i+1 };
                }

            }

        }
        int[] ints = new int[]{0};
        return ints ;

    }
}