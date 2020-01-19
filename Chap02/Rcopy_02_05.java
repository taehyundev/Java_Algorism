import java.util.Scanner;
public class Rcopy_02_05 {

	static void rcopy(int[] a, int[] b) {
		int num = b.length>= a.length?a.length:b.length;
		for(int i=0; i < num;i++) {
			a[i]=b[b.length-i-1]; // B의 것은 역으로 해서 a에 입력
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
		rcopy(a,b);
		System.out.println("rcopy 완료");
		for(int i=0; i<an;i++) {
		System.out.print(a[i] + " ");
		}
	}
}