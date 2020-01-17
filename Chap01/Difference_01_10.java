import java.util.Scanner;

public class Difference_01_10{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// your code goes her
		System.out.println("A  : ");
		int a = s.nextInt();
		int b;
		while (true) {
			System.out.println("B : ");
			b = s.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
					
		}
		System.out.println("b -a 는" + (b-a));
	}

}