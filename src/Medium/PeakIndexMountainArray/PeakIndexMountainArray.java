package PeakIndexMountainArray;

public class PeakIndexMountainArray {

	public static void main(String[] args) {
		System.out.println(peakIndexInMountainArray(new int[] {0, 2, 1, 0} ));
	}
	
	public static int peakIndexInMountainArray(int[] A) {
		if(A.length == 1)
			return 0;
		else {
			int i=1;
			
			while(A[i]>A[i-1])
				i++;
			
	        return i-1;
		}
	}
}
