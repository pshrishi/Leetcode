package AllPathsSourceToTarget;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceToTarget {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{1, 2}, {3}, {3}, {}};
		System.out.println((new AllPathsSourceToTarget()).allPathsSourceTarget(arr));
 	}
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		return doesPathEndAtTarget(graph, new ArrayList<Integer>(), 0, result);
    }
	
	public List<List<Integer>> doesPathEndAtTarget(int[][] graph, ArrayList<Integer> listSoFar, int curr, List<List<Integer>> result) 
	{
		if (curr == graph.length-1)
		{
			listSoFar.add(curr);
			result.add(listSoFar);
		}
		else {
			int[] neighbors = graph[curr];

			for (int i : neighbors) {
				ArrayList<Integer> newListSoFar = (ArrayList<Integer>)listSoFar.clone();
				newListSoFar.add(curr);
				result = doesPathEndAtTarget(graph, newListSoFar, i, result);
			}
		}
		return result;
	}

}
