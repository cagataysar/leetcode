import java.util.*;

public class MainClass {

    public static void main (String[] args) {

        MainClass.CodelandUsernameValidation("aljki");
    }

    public static String CodelandUsernameValidation(String str) {
        // code goes here
        String strList[] = str.split("");
        List<String> stringList = new ArrayList<String>(Arrays.asList(strList));
        //System.out.println(stringList.size());
        char c;
        if ((stringList.size() > 4) && (stringList.size() < 28)) {
            if (stringList.get(0).equals("_")){
                System.out.println("It must start with a letter.");
            } else if (stringList.get(stringList.size() - 1).equals("_")) {
                System.out.println("It cannot end with an underscore character.");
            }
            for (c = 'a'; c <= 'z'; ++c) {
                for (int i = 0; i < stringList.size() - 1; i++) {
                    if (stringList.get(i).equals(c)) {
                        str = "true";
                        break;
                    } else {
                        str = "false";
                        break;
                    }
                }
            }

        } else {
            str = "false";
        }

        return str;
    }


}
