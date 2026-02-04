package dsa;
import java.util.Scanner;

public class revNum {

	int ReverseInt(int n) {
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
		int v=sc.nextInt();
		revNum r=new revNum();
		System.out.println(r.ReverseInt(v));
		sc.close();
		
	}
}
