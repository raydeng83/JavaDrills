package snippet;

import java.util.Scanner;

/**
 * Created by lede on 7/29/16.
 */
public class FibonacciSeries {

    static int sum=0;

    public static void main(String[] args) {

        System.out.println("Enter number to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto "+number+" numbers : ");

        for (int i=1; i<= number; i++) {
            System.out.print(finonacci(i)+", ");
        }

    }

    public static int finonacci (int number) {
        if (number ==1 || number ==2) {
            return 1;
        }

        return finonacci(number-1) + finonacci(number -2);
    }
}
