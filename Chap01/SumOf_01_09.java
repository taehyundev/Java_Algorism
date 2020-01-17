import java.util.Scanner;

public class SumOf_01_09 {
	static int sumof(int a,int b) {
		int sum =0 ;
		for(int i=(a<b?a:b); i<=(a>b?a:b); i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// your code goes here
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(sumof(a,b));
		
	}

}