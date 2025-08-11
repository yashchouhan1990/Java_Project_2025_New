package com;

public abstract class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String original="Saras";
	//Print the original String
	System.out.println("Original String: "+original);
	
	String reverse="";
	
	for(int i=original.length()-1; i>=0; i--)
	{
		reverse +=original.charAt(i);
	}
	
	System.out.println("Reversed String: "+reverse);
	
	if(reverse.equalsIgnoreCase(original))
		System.out.println("String is Palindrom");
	else
		System.out.println("String is not Palindrome");
		
	}

}

/*
 *
 *Output:
 Original String: Saras
Reversed String: saraS
String is Palindrom
 * 
 * 
 */
