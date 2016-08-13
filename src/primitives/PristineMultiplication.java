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
        System.out.println(smartAdd(x, y));

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

    public static int smartAdd(int a, int b) {
        int sum=0, carryin=0, k=1, tempA=a, tempB=b;
        while(tempA != 0 || tempB != 0) {
            int ak= a&k, bk=b&k;
            int carryout = (ak&bk)|(ak&carryin)|(bk&carryin);
            sum|=(ak^bk^carryin);
            carryin=carryout<<1;
            k<<=1;
            tempA>>>=1;
            tempB>>>=1;
            System.out.println(
                    "tempA is "+Integer.toBinaryString(tempA)+
                            ", tempB is "+Integer.toBinaryString(tempB)+
                            ", sum is "+Integer.toBinaryString(sum)+
                            ", carryin is "+Integer.toBinaryString(carryin)+
                            ", carryout is "+Integer.toBinaryString(carryout)
            );
        }

        return sum | carryin;
    }
}
