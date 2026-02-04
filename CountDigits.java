package dsa;

import java.util.Scanner;

public class CountDigits {

    public static int countDigit(int n) {
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the number: ");
    	int num=sc.nextInt();
        int result = CountDigits.countDigit(num);
        System.out.println("Number of digits: " + result);
        sc.close();
    }
}
