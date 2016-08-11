package arrays.and.strings;

/**
 * Created by lede on 5/4/16.
 *
 * check if a string has unique chars
 */
public class Unique {

    public static void main(String[] args) {

        String str1 = "asdfqwerzcxawas";
        String str2 = "abcdeftghijkl";

        System.out.println(checkUnique(str1));
        System.out.println(checkUnique(str2));

    }

    public static boolean checkUnique(String str1) {

        if (str1.length()>128) {
            return false;
        }

        boolean[] charSet = new boolean[128];

        for (int i=0; i<str1.length(); i++) {

            int val = str1.charAt(i);

            if (charSet[val]) {
                return false;
            } else {
                charSet[val]=true;
            }
        }

        return true;

    }

}
