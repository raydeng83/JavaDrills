package primitives;

/**
 * Created by lede on 8/13/16.
 * <p>
 * Compute X * Y without arithmetic operator
 */
public class PristineMultiplication {

    public static void main(String[] args) {
        int x = 0b1101;
        int y = 0b101;
        System.out.println(smartMultiply(x, y));
    }

    public static int smartMultiply(int x, int y) {
        int result = 0;
        int i = 0;
        while (x != 0) {
            if ((x & 1) != 0) {
                result += y << (i);
            }
            i++;
            x >>= 1;
        }

        return result;
    }
}
