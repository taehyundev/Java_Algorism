import java.util.Scanner;
public class Max4_01_01 {
	static int max4(int a,int b,int c,int d) {
		int Max = a;
		if(Max<b) 
			Max =b;
		if(Max <c) 
			Max = c;
		if(Max<d)
			Max = d;
		return Max;
		
	}
	public static void main(String[] args) {

		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int Max =max4(n,n1,n2,n3);
		System.out.println(Max);
		
	}

}