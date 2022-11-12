import java.util.ArrayList;
import java.util.Arrays;

public class PalindromicClass {

    public static void main(String[] args) {
        PalindromicClass pClass = new PalindromicClass();
        pClass.isPalindrome("ALA");
    }

    public void  isPalindrome(String str) {

        String[] strSplit = str.split("");
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strSplit));

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = str.length() - 1; j > 0; j--) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
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
