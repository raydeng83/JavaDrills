package arrays.and.strings;

import java.util.Arrays;

/**
 * Created by lede on 7/28/16.
 *
 * write a method to replace all spaces in a string to %20
 */
public class URLify {

    public static void main(String[] args) {
        String str = "asdeqw asq asq aqw4 a43d ";

        System.out.println(str);
        System.out.println(urlify(str));
    }

    public static String urlify(String str) {

        int numberOfSpaces = 0;

        for (int i=0; i<str.length();i++) {
            if(str.charAt(i)==' ') {
                numberOfSpaces++;
            }
        }

        int index = str.length()+numberOfSpaces*2-1;

        char[] newStr = new char[index+1];

        for (int i= str.length()-1; i>=0;i--) {
            if(str.charAt(i)==' ') {
                newStr[index]='0';
                newStr[index-1]='2';
                newStr[index-2]='%';
                index=index-3;
            } else {
                newStr[index]=str.charAt(i);
                index--;
            }
        }

        return new String(newStr);

    }
}
