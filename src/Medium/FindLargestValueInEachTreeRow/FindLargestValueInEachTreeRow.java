package FindLargestValueInEachTreeRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindLargestValueInEachTreeRow {

	public static void main(String[] args) {
		
	}
	
    public List<Integer> largestValues(TreeNode root) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	HashMap<Integer, List<Integer>> data = gatherData(new HashMap<Integer, List<Integer>>(), 0, root);
    	
        if (data.isEmpty())
    		return new ArrayList<Integer>();
        
    	for(Integer i:data.keySet()) {
    		ArrayList<Integer> values = (ArrayList<Integer>) data.get(i);
    		Collections.sort(values, Collections.reverseOrder());
    		
    		result.add(i, values.get(0));
    	}
    	return result;
    }
    
    public HashMap<Integer, List<Integer>> gatherData(HashMap<Integer, List<Integer>> data, int level, TreeNode node) 
    {
        if (node == null)
            return new HashMap<Integer, List<Integer>>();
        
    	List<Integer> values;
    	if (data.containsKey(level))
    		values = data.get(level);
    	else
    		values = new ArrayList<Integer>();
    	
    	values.add(node.val);
    	data.put(level, values);
    	
    	if (node.left != null)
    		gatherData(data, level+1, node.left);
    	
    	if (node.right != null)
    		gatherData(data, level+1, node.right);
    	
    	return data;
    }

}
