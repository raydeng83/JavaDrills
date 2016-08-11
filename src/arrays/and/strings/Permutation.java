package arrays.and.strings;

import java.util.Arrays;

/**
 * Created by lede on 7/28/16.
 *
 * check if a string is a permutation of another
 */
public class Permutation {

    public static void main(String[] args) {

        String str1 = "asdfqwerzcxawas";
        String str2 = "abcdeftghijkl";

        String str3 = "abcdefghijkl";
        String str4 = "bcdafegihkjl";

        System.out.println(checkPermutation(str1, str2));
        System.out.println(checkPermutation(str3, str4));

    }

    public static boolean checkPermutation(String str1, String str2) {

        if (str1.length()!= str2.length()) return false;

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i=0; i<str1.length(); i++) {
            if (charArr1[i]!=charArr2[i])
                return false;
        }

        return true;
    }
}
