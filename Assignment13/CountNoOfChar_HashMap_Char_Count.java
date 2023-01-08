
/*
@author :- Rakhee Gaikwad
@Date :- 5 Jan 2022

Char[] arr2={‘a’,’c’,’d’,’f’,’a’}
Count no of character in given above array and 
create HashMap<Character,Integer> display character and its count.

*/
package basic;

import java.util.HashMap;
import java.util.Map;


//declaring a class CountNoOfChar_HashMap_Char_Count

public class CountNoOfChar_HashMap_Char_Count {

	//caling main method
	public static void main(String[] args) 
	{
		char[] arr2 = {'a', 'c', 'd', 'f', 'a'};

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        //using for each loop
        for (char c : arr2) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Character Count in the given array: ");		//printing
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}
	//end of main method
}
//end of class CountNoOfChar_HashMap_Char_Count