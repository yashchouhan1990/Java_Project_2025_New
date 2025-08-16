package handsOn;

import java.util.Scanner;

public class PrintFibonachiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fibonachi Series- 0,1,1,2,3,5,8,13
		
		int fab=0, a=0, b=1, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range of the Fibbonacci series");
		n=sc.nextInt();
		//while(fab<=n)
		for( int i=1; i<=n;i++)
		{
			System.out.print(a + " ");
			fab=a+b;
			a=b;
			b=fab;
		}
		sc.close();

	}

}

/*

Output:

Enter the range of the Fibbonacci series
10
0 1 1 2 3 5 8 13 21 3


*/