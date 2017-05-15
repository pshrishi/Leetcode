package Easy;

public class MatrixReshape {

	public static void main(String[] args) {
		System.out.println(new MatrixReshape().matrixReshape(new int[][] { {1, 2}, {3, 4} }, 1, 4));
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        
        int[][] newArray = new int[r][c];
        int num = -1;
        if (rows * columns == r * c) {
        	for (int i=0; i<rows; i++) {
        		for (int j=0; j<columns; j++) {
        			num++;
                	newArray[num/c][num%c] = nums[i][j];
        		}
        	}
        	
        	nums = newArray;
        }
        
        return nums;
    }
}
