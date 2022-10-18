public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.search(new int[]{2, 3, 6, 7, 9, 2},5);
    }

    public int search(int[] nums, int target) {
        int i;
        System.out.println(nums.length);
        System.out.println(nums[0]);

        for(i = 0; i < nums.length - 1; i++) {
            //System.out.print(" nums" + i + " " + nums[i]);
                if (nums[i] == target) {
                    return nums[i];
            } else System.out.println(-1);
        }
        return i;
    }
}
