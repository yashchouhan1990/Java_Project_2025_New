package com;

public class CapitaliseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original="my name is yash chouhan";
		System.out.println("Original String :" +original);
		String capitalWords="";	
		String[] stringArray= original.split(" ");
		
		for(String s : stringArray  )
		{
			String firstLetter=s.substring(0, 1).toUpperCase();
			String restLetters=s.substring(1).toLowerCase();
			capitalWords = capitalWords+ firstLetter + restLetters + " ";
		}
		
		System.out.println("Result: "+ capitalWords.trim());
		
	}

}

/*
Output 

Original String :my name is yash chouhan
Result: My Name Is Yash Chouhan


*/