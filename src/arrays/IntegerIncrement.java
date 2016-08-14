package arrays;

import java.util.Arrays;

/**
 * Created by Le on 8/13/2016 0013.
 */
public class IntegerIncrement {

    public static void main(String[] args) {
        int[] intArr = new int[]{1,3,4,5,1,3,9,9};
        System.out.println(Arrays.toString(plusOne(intArr)));
    }

//    public static int[] plusOneBetter (int[] A) {
//        int carryIn = 0;
//        for(int i=0;i<A.length;i++) {
//            if(A[i]+1)
//        }
//    }

    //brutal force
    public static int[] plusOne (int[] A) {
        int convertedInteger=0;

        for (int i=A.length; i>0; i--) {
            convertedInteger+=A[i-1]*Math.pow(10,A.length-i);
        }

        convertedInteger+=1;
        String integerString = convertedInteger+"";

        char[] charArr = integerString.toCharArray();

        int[] intArr = new int[charArr.length];

        for (int i=0; i<intArr.length;i++) {
            intArr[i]=Character.getNumericValue(charArr[i]);
        }

        return intArr;
    }
}
