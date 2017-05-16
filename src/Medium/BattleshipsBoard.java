package Medium;

public class BattleshipsBoard {

	public static void main(String[] args) {
		char[][] board = new char[][] {
			{'.','.','.','.', '.'},
			{'.','.','.','.', '.'},
			{'.','.','.','.', 'X'},
			{'.','.','.','.', '.'},
			{'.','.','.','.', '.'}
		};
		
		System.out.println(new BattleshipsBoard().countBattleships(board));
	}
	
	public int countBattleships(char[][] board) {
        int rows = board.length;
        int columns = board[0].length;
        
        int[][] visited = new int[rows][columns];
        
        int count = 0;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				if (visited[i][j] == 1)
					continue;
				
				visited[i][j] = 1;
				
				if (board[i][j] == 'X') {
					if (j+1 < columns && board[i][j+1] == 'X') {
						count++;
						int k = j;
						
						while ( k<columns && board[i][k] == 'X') {
							visited[i][k] = 1;
							k++;
						}
					}
					else if (i+1 < rows && board[i+1][j] == 'X') {
						count++;
						int k = i;
						
						while (k<rows && board[k][j] == 'X') {
							visited[k][j] = 1;
							k++;
						}
					}
					else {
						count++;
					}
				}
			}
		}
		
		return count;
    }
}
