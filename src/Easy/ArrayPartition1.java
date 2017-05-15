package Easy;

public class ArrayPartition1 {
	public static void main(String[] args) {
		System.out.println(new ArrayPartition1().arrayPairSum(new int[] {1, 4, 3, 2}));
	}
	
	public int arrayPairSum(int[] nums) {
        nums = quickSort(nums, 0, nums.length - 1);
        
        int sum = 0;
        
        for (int i=0; i<nums.length; i = i+2) {
        	sum += nums[i];
        }
        
        return sum;
    }
	
	//Sorting in non decreasing order
    private static int[] quickSort(int[] arr, int i, int j) {
        if(i < j) {
            int pos = partition(arr, i, j);
            quickSort(arr, i, pos - 1);
            quickSort(arr, pos + 1, j);
        }
        
        return arr;
    }

    private static int partition(int[] arr, int i, int j) {
        int pivot = arr[j];
        int small = i - 1;

        for(int k = i; k < j; k++) {
            if(arr[k] <= pivot) {
                small++;
                swap(arr, k, small);
            }
        }

        swap(arr, j, small + 1);
        return small + 1;
    }

    private static void swap(int[] arr, int k, int small) {
        int temp;
        temp = arr[k];
        arr[k] = arr[small];
        arr[small] = temp;
    }

}
