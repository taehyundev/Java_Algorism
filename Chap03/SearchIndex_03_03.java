import java.util.Scanner;
public class SearchIndex_03_03 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt =0;
		for(int i=0; i<n;i++) {
			if(a[i] == key)
				idx[cnt++] = i;
		}		
				return cnt;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = s.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int k ;
		for(int i=0; i<n; i++) 
			x[i] = s.nextInt();
		
		System.out.println("Search Key : ");
		k = s.nextInt();
		int cnt = searchIdx(x, n, k, y);
		if(cnt ==0) 
			System.out.println("값이 없습니다.");
		else {
		System.out.println("같은 key :" +cnt + "개");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%d 안에 존재\n", y[i]);
		}
		
		}
	}
}
