package handsOn;

public class StringPalindromeTest {

	public static void main(String[] args) {
		
		String original="Saras";
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse + original.charAt(i);
		}
		
		System.out.println("Original String :"+original);
		System.out.println("String after reverse :"+reverse);
		
		if(reverse.equalsIgnoreCase(original))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not palindrome");
		

	}

}
