package handsOn;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, flag, range;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check if it Prime or not");
		range= sc.nextInt();
		
		for(num=2;num<=range; num++)
		{
			flag=1;
			
			for (int i=2; i<num; i++)
			{
				if( num%i==0) {
					flag=0;
					break;
				}
				
			}
			
			if(flag==1)
				System.out.print(num+" ");
			}
	}

}
