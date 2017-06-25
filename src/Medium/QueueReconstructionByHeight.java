package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		int[][] people = new int [][] {{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};
		
		System.out.println(new QueueReconstructionByHeight().reconstructQueue(people));
	}
	
	public int[][] reconstructQueue(int[][] people) {
		Map<Integer, ArrayList<Number>> map = new TreeMap<Integer, ArrayList<Number>>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}
					
				});
        
		int total = people.length;
        
        for (int i=0; i<total; i++) {
    		Number n = new Number(people[i][0], people[i][1]);
    		
    		if(map.containsKey(n.h) && map.get(n.h).size() > 0) {
    			ArrayList<Number> list = map.get(n.h);
    			list.add(n);
    			map.put(n.h, list);
    		}
    		else {
    			ArrayList<Number> list = new ArrayList<>();
    			list.add(n);
    			map.put(n.h, list);
    		}
        }
        
        for (Integer key: map.keySet()) {
        	ArrayList<Number> list = map.get(key);
        	Collections.sort(list);
        	map.put(key, list);
        }
        
        ArrayList<Number> result = new ArrayList<>();

        for (Integer key: map.keySet()) {
        	ArrayList<Number> list = map.get(key);
        	for (Number n: list) {
        		result.add(n.k, n);
        	}
        }
        
        return numberArrayToIntArray(result);
    }
	
	private int[][] numberArrayToIntArray(ArrayList<Number> list) {
		int[][] result = new int[list.size()][2];
		int count = 0;
		for (Number n: list) {
			result[count][0] = n.h;
			result[count][1] = n.k;
			count++;
		}
		
		return result;
	}

	class Number implements Comparable<Number>{
		int h;
		int k;
		
		Number (int _h, int _k) {
			h = _h;
			k = _k;
		}

		@Override
		public int compareTo(Number o) {
			if (this.k > o.k)
				return 1;
			else if(this.k < o.k)
				return -1;
			else
				return 0;
		}
		
		@Override
		public String toString() {
			return "[" + h + ", " + k + "]";
		}
	}
}
