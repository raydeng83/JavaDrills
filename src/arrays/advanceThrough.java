package arrays;

/**
 * Created by Le on 8/14/2016 0014.
 */
public class advanceThrough {
    public static void main(String[] args) {
        int[] A = new int[]{1,0,2,0,1,1,3,0,0,1};
        System.out.println(advanceIt(A));
    }

    public static boolean advanceIt(int[] A) {
        int i = A.length - 1;
        for (int j = i - 1; j >= 0; j--) {
            if (A[j] >= (i - j)) {
                System.out.println(j);
                if (j == 0) {
                    return true;
                } else {
                    i = j;
                    continue;
                }
            }
        }

        return false;
    }
}
