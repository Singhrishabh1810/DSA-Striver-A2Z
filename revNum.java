package dsa;

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
		int v=123;
		revNum r=new revNum();
		r.ReverseInt(v);
		System.out.println(v);
		
	}
}
