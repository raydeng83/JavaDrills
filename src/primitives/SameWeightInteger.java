package primitives;

/**
 * Created by Le on 8/13/2016.
 *
 * Given an integer, find the least difference integer having the same weight
 */
public class SameWeightInteger {

    public static void main(String[] args) {
        int x=0b10010101010;
        System.out.println(Integer.toBinaryString(findSameWeight(x)));
    }

    static int findSameWeight(int x) {
        int n=x; int b1, b2; int i=0; int mask;
        while(n!=0) {
            b1=n&1;
            n>>=1; i++;
            b2=n&1;
            if(b1 != b2) {
                mask = (1<<i)|(1<<(i-1));
                return x^mask;
            }
        }

        throw new Error("All zeros or ones");
    }
}
