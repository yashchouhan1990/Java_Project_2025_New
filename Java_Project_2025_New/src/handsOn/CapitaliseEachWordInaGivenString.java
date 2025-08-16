package handsOn;

public class CapitaliseEachWordInaGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="hello there how are you";
		String captialisewords="";
		
		System.out.println("Oiginal String :"+original);
		
		String[] words=original.split(" ");
		
		//Captilase each words
		for (String word: words)
		{
			String firstLetter=word.substring(0,1).toUpperCase();
			String restLetters=word.substring(1).toLowerCase();
			captialisewords=captialisewords + firstLetter + restLetters + " ";
		}
		
		System.out.println("Final String: "+captialisewords);
		
		

	}

}
