public class FindPivotIndex {

    /**
     * Example 1:
     *
     * Input: nums = [1,7,3,6,5,6]
     * Output: 3
     * Explanation:
     * The pivot index is 3.
     * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
     * Right sum = nums[4] + nums[5] = 5 + 6 = 11
      * @param args
     */
    public static void main(String[] args) {
        pivotIndex(new int[]{1,7,3,6,5,6});
    }

    public static void pivotIndex(int[] nums) {
        int firstSum = 0;
        int secondSum = 0;
        int i, j, k;
        for (i = 1; i < nums.length; i++) {
            for (j = 0; j < i; j++) {
                firstSum += j;
            }
            for (k = nums.length - 1; k > i; k--) {
                secondSum += j;
            }

        }
        if (firstSum == secondSum) {
            System.out.println(nums[i]);
        }
        else {
            System.out.println("-1");
        }
    }
}
