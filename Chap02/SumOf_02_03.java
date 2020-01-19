import java.util.Scanner;
public class SumOf_02_03 {

	static int sumOf(int[] a) {
	int sum =0 ;	
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("요솟수 : ");
		n = s.nextInt();
		int a[] =new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("배열의 합계 : "+ sumOf(a));
	}
}