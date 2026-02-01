package dsa;
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		
		if(n==0) {
			System.out.println("Number of digits:1"); 
			return;
		}
		while(n>0) {
			n=n/10;
			count+=1;
		}
		
		
		
		System.out.println("Number of digits: "+count);
		sc.close();
		
	}

}
