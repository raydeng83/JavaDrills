package primitives;

/**
 * Created by lede on 8/11/16.
 */
public class Parity {

    public static void main(String[] args) {
        int x=67189235;
        System.out.println(parity(x));
    }

    public static short parity(int x) {
        short result=0;
        while(x!=0) {
            result^=(x&1);
            x>>>=1;
        }
        return result;
    }
}
