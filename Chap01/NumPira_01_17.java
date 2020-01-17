import java.util.Scanner;

public class NumPira_01_17 {
	static void spira(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// your code goes her
		int n;
		do {
			System.out.println("단수 : ");
		n = s.nextInt();
		}while(n<=0);
		spira(n);
	}

}