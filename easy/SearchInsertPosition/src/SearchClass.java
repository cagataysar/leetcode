public class SearchClass {

    public static void main(String[] args) {
        SearchClass sClass = new SearchClass();
        sClass.searchInsert(new int[]{1,3,4,5,6,7},6 );

    }

    public static void searchInsert(int[] nums, int target) {
        /*
        * Input: nums = [1,3,5,6], target = 5
        * Output: 2
        * Input: nums = [1,3,5,6], target = 2
        * Output: 1
        */
        int i;
        int min;
        int max = nums.length;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                break;
            } /*else {
                System.out.println(target - i);
            }*/
        }
    }
}
