package arrays;

import java.util.*;

/**
 * Created by Le on 8/14/2016 0014.
 *
 * Assume the array is sorted
 */
public class DeleteDuplicates {

    public static void main(String[] args) {
        int[] A = new int[]{1,4,2,4,5,7,8,10,3,4,10,22,14,1};
        Arrays.sort(A);
        System.out.println(Arrays.toString(deleteDuplicates1(A)));
    }

    //Assume array sorted
    public static int[] deleteDuplicates1(int[] A) {
        int[] arr = new int[A.length];
        int j=0;
        for (int i=0; i<A.length; i++) {
            if (i==0) {
                arr[j]=A[i];
                j++;
            } else {
                if (A[i]!=A[i-1]) {
                   arr[j]=A[i];
                    j++;
                } else {
                    continue;
                }
            }
        }

        return Arrays.copyOfRange(arr,0,j);
    }

    //if array oder doesn't matter
    public static int[] deleteDuplicates2(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int n : A) {
            set.add(n);
        }

        int[] newArr = new int[set.size()];
        int i=0;
        for (int n : set) {
            newArr[i]=n;
            i++;
        }

        return newArr;
    }
}
