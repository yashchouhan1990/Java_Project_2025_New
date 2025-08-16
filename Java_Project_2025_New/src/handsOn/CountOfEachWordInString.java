package handsOn;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love fruits. Fruits are good for health. Fruits are tasty";
		
		String[] strArray=str.split(" ");
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for( String word : strArray)
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		
		//Print
		for(Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey()+ ":" + entry.getValue());
					
	}

}
