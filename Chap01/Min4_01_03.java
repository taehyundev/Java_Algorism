import java.util.Scanner;
public class Min4_01_03 {
	static int min3(int a,int b,int c,int d) {
		int Min = a;
		if(Min>b) 
			Min =b;
		if(Min >c) 
			Min = c;
		if(Min >d) 
			Min = d;
		return Min;
		
	}
	public static void main(String[] args) {

		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int MIN =min3(n,n1,n2, n3);
		System.out.println(MIN);
		
	}

}