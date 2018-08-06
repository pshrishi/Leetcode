package FindAllDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		System.out.println(new FindAllDuplicates().findDuplicates(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));
	}
	
	public List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
		HashSet<Integer> result = new HashSet<Integer>();
		
		for (int i: nums) {
        	if(!store.containsKey(i))
        		store.put(i, 1);
        	else
        	{
        		if (!result.contains(i))
        			result.add(i);
        	}
        }
		
		return new ArrayList<Integer>(result);
    }

}
