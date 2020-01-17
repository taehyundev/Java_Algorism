public class Square_01_14 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// your code goes her
		int n;
		do {
			System.out.println("단수 : ");
		n = s.nextInt();
		}while(n<=0);
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}