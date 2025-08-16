package handsOn;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, rev=0,temp, rem;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check if it Palindrome or not");
		num= sc.nextInt();
		temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10 + rem;
			
		}

		if(rev==temp)
			System.out.println(" Number is Palindome");
		else
			System.out.println(" Not a Palindrome Number");
		
		sc.close();
	}

}
