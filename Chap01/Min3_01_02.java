import java.util.Scanner;
public class Min3_01_02 {
	static int min3(int a,int b,int c) {
		int Min = a;
		if(Min>b) 
			Min =b;
		if(Min >c) 
			Min = c;
		return Min;
		
	}
	public static void main(String[] args) {

		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int MIN =min3(n,n1,n2);
		System.out.println(MIN);
		
	}

}