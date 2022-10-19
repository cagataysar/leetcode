import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.search(new int[]{2, 3, 5, 7, 9, 2},9);
    }

    static void search(int[] nums, int target) {

        int i ;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                break;
            }
        }


    }
}
