package PartitionLabels;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
	public static void main(String[] args) {
		
	}
	
	public List<Integer> partitionLabels(String s) {
		Map<Character, Integer> minMap = new HashMap<Character, Integer>();
		Map<Integer, Character> reverseMap = new HashMap<Integer, Character>();
		Map<Character, Integer> maxMap = new HashMap<Character, Integer>();
		
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if (minMap.containsKey(arr[i]) && maxMap.get(arr[i])<i) {
				maxMap.put(arr[i], i);
			}
			else {
				minMap.put(arr[i], i);
				minMap.put(arr[i], i);
				reverseMap.put(i, arr[i]);
			}
		}
		
		List<Integer> minValues = (List<Integer>) minMap.values();
		Collections.sort(minValues);
		
		for(int i:minValues) {
			char c = reverseMap.get(i);
			int maxIndex = maxMap.get(c);
		}
		
		return null;
	}
}
