import java.util.Scanner;

public class SumGauss_01_08 {
	public static void main(String[] args) {

		// your code goes here
		System.out.println("1 ~ n Add : ");
		System.out.print("n의 값 : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = (1+n) * (n/2)+(n%2==0?0:(n+1)/2);
		System.out.println("Sum = "+ sum);
	}

}