import java.util.Scanner;

public class Triangle_01_15{
	static void triangleLB(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=i; j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRB(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=i; j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
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
		System.out.println("왼쪽 아래가 직각 ");
		triangleLB(n);
		System.out.println("왼쪽 위가 직각 ");
		triangleLU(n);
		System.out.println("오른쪽 위가 직각 ");
		triangleRU(n);
		System.out.println("오른쪽 아래가 직각 ");
		triangleRB(n);
	}

}