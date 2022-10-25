import java.util.ArrayList;
import java.util.Arrays;

public class PClass {

    public static void main(String[] args) {
        PClass p = new PClass();
        p.isPalindrome("XOXO");
    }

    public void  isPalindrome(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = str.length() - 1; j > 0; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Yes!");
                    break;
                } else {
                    System.out.println("No.");
                    break;
                }
            }
            break;
        }
    }
}
