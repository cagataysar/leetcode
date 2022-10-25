import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.search(new int[]{2, 3, 5, 7, 9, 2, 8, 12},8);

        // new int[]{1,3,4,5,6,7} target: 6 -> output: 4
        // new int[]{1,3,4,5,6,7} target: 2 -> output: -1 (2 is not an element of array) ??????

    }

    static void search(int[] nums, int target) {

        int i;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}
