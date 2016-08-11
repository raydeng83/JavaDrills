package primitives;

/**
 * Created by lede on 8/4/16.
 */
public class CountNumberOfOnes {

    public static void main(String[] args) {
        int x = 0b1100110;

        System.out.println(countBits(x));
    }

    public static short countBits (int x) {
        short numberOfBits = 0;

        while (x!=0) {
            numberOfBits += x & 1;
            x >>>= 1;
        }

        return numberOfBits;
    }
}
