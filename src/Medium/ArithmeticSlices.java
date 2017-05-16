package Medium;

import java.util.HashMap;

public class ArithmeticSlices {

	HashMap<String, Integer> store;
    
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4};
		System.out.println(new ArithmeticSlices().numberOfArithmeticSlices(nums));	
	}
	
	
	public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
        	return 0;
        
        store = new HashMap<String, Integer>();
        
        return 0;
    }
}
