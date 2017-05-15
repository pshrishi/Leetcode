package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {
		System.out.println(new DistributeCandies().distributeCandies(new int[] {1, 2, 3, 4, 2, 2}));
	}
	
	public int distributeCandies(int[] candies) {
        Map map = new HashMap<Integer, Integer>();
		Set unique = new HashSet<Integer>();
		
        for (int i=0; i<candies.length; i++) {
        	if(map.containsKey(candies[i])) {
        		map.put(candies[i], map.get(candies[i] + 1));
        	}
        	else
        		map.put(candies, 1);
        	
        	if (!unique.contains(candies[i]))
        		unique.add(candies[i]);
        }
		
        if (candies.length/2 > unique.size())
        	return unique.size();
        else
        	return candies.length/2;
    }
}
