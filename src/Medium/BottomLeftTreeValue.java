package Medium;

public class BottomLeftTreeValue {

	public static void main(String[] args) {
		TreeNode _1 = new TreeNode(1);
		TreeNode _2 = new TreeNode(2);
		TreeNode _3 = new TreeNode(3);
		TreeNode _4 = new TreeNode(4);
		TreeNode _5 = new TreeNode(5);
		TreeNode _6 = new TreeNode(6);
		TreeNode _7 = new TreeNode(7);
		_5.left = _7;
		_2.left = _4;
		_3.left = _5;
		_3.right = _6;
		_1.left = _2;
		_1.right = _3;
		
		TreeNode root = _1;
		System.out.println( new BottomLeftTreeValue().findBottomLeftValue(root));
	}

	public int findBottomLeftValue(TreeNode root) {
        return findLeftValue(root, 0).value;
    }
	
	public Answer findLeftValue (TreeNode root, int height) {
		if (root.left == null && root.right == null)
	        return new Answer (root.val, height);
		else if ((root.left != null && root.right != null)) {
			Answer leftAnswer = findLeftValue(root.left, height+1);
			Answer rightAnswer = findLeftValue(root.right, height+1);
			
			if (leftAnswer.height >= rightAnswer.height)
				return leftAnswer;
			else
				return rightAnswer;
		}
		else if (root.left != null && root.right == null)
			return findLeftValue(root.left, height+1);
		else
			return findLeftValue(root.right, height+1);
	}
}

class TreeNode {
	 	int val;
	 	TreeNode left;
	 	TreeNode right;
	 	TreeNode(int x) { val = x; }
	 }

class Answer {
	int value;
	int height;
	
	public Answer (int _value, int _height) {
		value = _value;
		height = _height;
	}
}