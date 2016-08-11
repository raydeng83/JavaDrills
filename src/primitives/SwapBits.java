package primitives;

/**
 * Created by lede on 8/11/16.
 */
public class SwapBits {
    public static void main(String[] args) {
        long x=0b110000001110;
        System.out.println(Long.toBinaryString(swapBits(x, 7, 2)));
    }

    public static long swapBits(long x, int i, int j) {
        if (((x >> i) & 1) != ((x >> j) & 1)) {
            long bitMask = (1 << i) | (1 << j);
            x ^= bitMask;
        }
        return x;
    }
}
