package handsOn;

import java.util.Scanner;

public class PrintArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 153 - 1x1x1 + 5x5x5 + 3x3x3 =153
		
		int n,p,rem=0, temp,count=0, sum=0;
		System.out.println("Enter any number to check if it is Armstrong");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		temp=n;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		n=temp;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			p=1;
			
			for(int i=1; i<=count; i++)
			{
				p=p*rem;
			}
			sum=sum+p;
			
		}
		
		if(sum==temp)
			System.out.println("Number is Armstring");
		else
			System.out.println("Not a Armstrong Number");
		
		

	}

}
