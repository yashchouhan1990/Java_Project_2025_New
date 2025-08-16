package handsOn;

import java.util.Scanner;

public class CheckNumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, flag=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check if it Prime or not");
		num= sc.nextInt();
		
		
		for (int i=2; i<num; i++)
		{
			if( num%i==0) {
				flag=0;
				break;
			}
			
		}
		
		if(flag==1)
			System.out.println("Its a prime number");
		else
			System.out.println("Not a prime number");
		

	}

}
