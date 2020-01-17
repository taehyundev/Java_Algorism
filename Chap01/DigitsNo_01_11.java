import java.util.Scanner;

public class DigitsNo_01_11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// your code goes her
		int n;
		do {
		System.out.println("N  : ");
		 n = s.nextInt();
		if(n<=0) {
			System.out.println("양의 정수를 입력해주세요.");
		}
		}while(n<=0);
		int cnt =0;
		while(n>0) {
			n = n/10;
			cnt++;
		}
		System.out.println("자릿수 " + cnt);
		
	}

}