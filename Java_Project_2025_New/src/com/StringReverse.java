package com;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Approach 3. 
		System.out.println("*****Approach 1****");			
		String ori="YashChouhan";
		String rev="";
		
		System.out.println("Original String: "+ori);
		for(int i=ori.length()-1; i>=0; i--)
		{
			rev=rev+ori.charAt(i);
		}
		
		System.out.println("Reversed String: "+ rev);

// Approach 2. 
		System.out.println("*****Approach 2****");
		
		String original="India";
		String reverse="";
		System.out.println("Original String: "+original);
		
		char[] charArray= original.toCharArray();
		
		for(int i=charArray.length-1; i>=0;i--)
		{
			reverse += charArray[i];
		}
		System.out.println("Reversed String: "+reverse);
		
// Approach 3. 
		System.out.println("*****Approach 3****");	
		
		StringBuilder s= new StringBuilder("Automation");
		System.out.println("Original String :" +s);
		System.out.println("String reverse using inbuilt function: "+s.reverse());
		
	}

}

/*

*****Approach 1****
Original String: YashChouhan
Reversed String: nahuohChsaY
*****Approach 2****
Original String: India
Reversed String: aidnI
*****Approach 3****
Original String :Automation
String reverse using inbuilt function: noitamotuA

 */
