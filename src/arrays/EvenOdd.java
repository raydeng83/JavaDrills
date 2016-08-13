package arrays;

import java.util.Arrays;

/**
 * Created by lede on 8/13/16.
 */
public class EvenOdd {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,8,2,13,6,9,12,42,78,44,23};
        evenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void evenOdd(int[] A) {
        int nextEven=0, nextOdd=A.length-1;
        while(nextEven<nextOdd){
            if(A[nextEven]%2==0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven]=A[nextOdd];
                A[nextOdd--]=temp;
            }
        }
    }
}
