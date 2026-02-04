package dsa;
import java.util.Scanner;

public class revNum {

	public static int ReverseInt(int n) {
		int reversed=0;
		while(n!=0) {
			int c=n%10;
			reversed=reversed*10+c;
			n=n/10;
		}
		return reversed;
	}




	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int v=sc.nextInt();
		System.out.println(ReverseInt(v));
		sc.close();
		
	}
}
