package primitives;

/**
 * Created by lede on 8/11/16.
 */
public class ReverseBits {

    public static void main(String[] args) {
        long x = 0b100101010010;
        System.out.println(Long.toBinaryString(reverseBits(x)));
    }

    public static long reverseBits(long x) {
        long b = 0;
        while (x != 0) {
            b <<= 1;
            b |= (x & 1);
            x >>= 1;

        }
        return b;
    }
}
