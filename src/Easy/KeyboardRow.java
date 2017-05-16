package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		String[] words = { "Alaska", "Beyonce" };
		System.out.println(new KeyboardRow().findWords(words));
	}
	
	public String[] findWords(String[] words) {
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        chars.put('Q', 1);
        chars.put('W', 1);
        chars.put('E', 1);
        chars.put('R', 1);
        chars.put('T', 1);
        chars.put('Y', 1);
        chars.put('U', 1);
        chars.put('I', 1);
        chars.put('O', 1);
        chars.put('P', 1);
        chars.put('q', 1);
        chars.put('w', 1);
        chars.put('e', 1);
        chars.put('r', 1);
        chars.put('t', 1);
        chars.put('y', 1);
        chars.put('u', 1);
        chars.put('i', 1);
        chars.put('o', 1);
        chars.put('p', 1);
        chars.put('A', 2);
        chars.put('S', 2);
        chars.put('D', 2);
        chars.put('F', 2);
        chars.put('G', 2);
        chars.put('H', 2);
        chars.put('J', 2);
        chars.put('K', 2);
        chars.put('L', 2);
        chars.put('a', 2);
        chars.put('s', 2);
        chars.put('d', 2);
        chars.put('f', 2);
        chars.put('g', 2);
        chars.put('h', 2);
        chars.put('j', 2);
        chars.put('k', 2);
        chars.put('l', 2);
        chars.put('Z', 3);
        chars.put('X', 3);
        chars.put('C', 3);
        chars.put('V', 3);
        chars.put('B', 3);
        chars.put('N', 3);
        chars.put('M', 3);
        chars.put('z', 3);
        chars.put('x', 3);
        chars.put('c', 3);
        chars.put('v', 3);
        chars.put('b', 3);
        chars.put('n', 3);
        chars.put('m', 3);
        
        int count = 0;
        List<String> result = new ArrayList<String>();
        
        for (String word: words) {
        	int i=0;
        	int row = chars.get(word.charAt(0));
        	
        	while (i<word.length() && row == chars.get(word.charAt(i)))
        		i++;
        	
        	if (i == word.length())
        		result.add(word);
        }
        
        String[] res = new String[result.size()];
        return result.toArray(res);
    }
}
