import java.util.Scanner;
public class Copy_02_04 {

	static void copy(int[] a, int[] b) {
		int num = b.length>= a.length?a.length:b.length; // a < b || a == b (a에 b의 값 입력) b가 아닌 a를 기준으로 
								//b가 더 작다면 b를 기준으로
		for(int i=0; i < num;i++) {
			a[i]=b[i];
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("A의 요솟수 : ");
		int an = s.nextInt();
		int a[] = new int[an];
		for(int i=0; i<an;i++) {
			a[i] = s.nextInt();
		}
		System.out.print("B의 요솟수 : ");
		int bn = s.nextInt();
		int b[] = new int[bn];
		for(int i=0; i<bn;i++) {
			b[i] = s.nextInt();
		}
		copy(a,b);
		System.out.println("copy 완료");
		for(int i=0; i<an;i++) {
		System.out.print(a[i] + " ");
		}
	}
}