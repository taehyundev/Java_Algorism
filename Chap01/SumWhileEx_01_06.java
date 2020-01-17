import java.util.Scanner;

public class SumWhileEx_01_06 {
	public static void main(String[] args) {

		// your code goes here
		System.out.println("1 ~ n Add : ");
		System.out.print("n의 값 : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		int i=1;
		while(i <=n) {
			sum += i;
			i++;
		}
		System.out.println("Sum = "+sum +", i = "+i);
	}

}