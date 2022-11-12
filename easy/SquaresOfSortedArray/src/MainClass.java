import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

    // nums = [-4,-1,0,3,10] -> Output: [0,1,9,16,100]
    // Input: nums = [-7,-3,2,3,11] -> Output: [4,9,9,49,121]

    public static void main(String[] args) {
        MainClass mc = new MainClass();
        mc.sortedSquares(new int[]{-7,-3,2,3,11});
    }

    public void sortedSquares(int[] nums) {

        ArrayList arrayList = new ArrayList();
        int j;

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
            arrayList.add(nums[i]);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
