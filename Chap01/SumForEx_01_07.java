import java.util.Scanner;

public class SumForEx_01_07 {
	public static void main(String[] args) {

		// your code goes here
		System.out.println("1 ~ n Add : ");
		System.out.print("n의 값 : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		for(int i=1;i <=n;i++) {
			sum += i;
		}
		System.out.println("Sum = "+sum);
	}

}