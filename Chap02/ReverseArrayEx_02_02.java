import java.util.Scanner;
public class ReverseArrayEx_02_02 {

	static void swap(int a[],int n,int n1 ) {
		int temp = a[n];
		a[n] = a[n1];
		a[n1] = temp;
		
	}
	static void print(int a[]) {
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
	static void reverse(int a[]) {
		for(int i =0; i< a.length/2;i++) {
			System.out.println("\n a["+i+"]와 a["+(a.length-i-1)+"]를 교환합니다.");

			swap(a,i, a.length-i-1);
			print(a);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int MAX = 6;
		
		int x[] =new int[MAX];
		for(int i=0; i<MAX;i++) {
			x[i] = s.nextInt();
		}
		reverse(x);
		System.out.println("\n역순 정렬을 마쳤습니다.");
		for(int i=0 ; i<MAX;i++) {
			System.out.print(x[i]+" ");
		}
	}
}