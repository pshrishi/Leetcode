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
        Set unique = new HashSet<Integer>();
		
        for (int i=0; i<candies.length; i++) {
        	if (!unique.contains(candies[i]))
        		unique.add(candies[i]);
        	
        	if (unique.size() > candies.length/2)
        		return candies.length/2;
        }
		
        return unique.size();
    }
}
