package handsOn;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="Yash Chouhan";
		String reverse="";
		//char[] char=original.toCharArray();
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse + original.charAt(i);
		}
		
		System.out.println("Reversed String: "+reverse);
			
			
		
// 2. Another approach
		
		StringBuilder sb= new StringBuilder("Hello World");
		
		System.out.println("String reversed :"+sb.reverse());

//3. Approach-
		
		String str= "How is your day going on";
		String rev="";
		
		System.out.println("Actual String: "+str);
		
		char[] charArray= str.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--)
		{
			rev=rev+charArray[i];
		}
		
		System.out.println("String after reverse:"+rev);
				
		

	}

}
