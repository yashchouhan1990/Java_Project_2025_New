package handsOn;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello to the world of Java";
		
		// Remove spaces if you don't want to count them
        str = str.replace(" ", "");
        
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		char[] chArray= str.toCharArray();
		
		for(char c : chArray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet() )
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		
		//Print Non-repeated characters
		for(Map.Entry<Character, Integer> entry1 : map.entrySet() )
		if(entry1.getValue()==1)
			System.out.println("Non Repeated Characters "+entry1.getKey()+":"+entry1.getValue());
		
	}

}
