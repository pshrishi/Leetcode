package SingleElementSortedArray;

import java.util.HashSet;

public class SingleElementSortedArray {

	public static void main(String[] args) {
		System.out.println(new SingleElementSortedArray().singleNonDuplicate(new int[] {1, 1, 2, 2, 4, 4, 3, 5, 5} ));
	}
	
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> data = new HashSet<Integer>();
        
        for(int i:nums) {
        	if (data.contains(i)) {
        		data.remove(i);
        	}
        	else {
        		data.add(i);
        	}
        }
        
    	return (int) data.toArray()[0];
    }
}
