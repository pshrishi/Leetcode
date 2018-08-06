package WordBreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		System.out.println(wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
        return recursiveWordBreak(0, s, wordDict);
    }
	
	public static boolean recursiveWordBreak(int index, String subString, List<String> wordDict) {
		if (index > subString.length())
			return false;
		
		if (wordDict.contains(subString.substring(0, index))) {
			if (index == subString.length())
				return true;
			else
				return recursiveWordBreak(0, subString.substring(index), wordDict) || recursiveWordBreak(index+1 , subString, wordDict); 
		}
		else
			return recursiveWordBreak(index+1 , subString, wordDict);
	}
}
