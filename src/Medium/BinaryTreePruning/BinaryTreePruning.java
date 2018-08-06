package BinaryTreePruning;

public class BinaryTreePruning {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(0);
		TreeNode c = new TreeNode(1);
		TreeNode d = new TreeNode(0);
		TreeNode e = new TreeNode(0);
		TreeNode f = new TreeNode(0);
		TreeNode g = new TreeNode(1);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		
		new BinaryTreePruning().pruneTree(a);
		System.out.println("All done!");
	}
	
	public TreeNode pruneTree(TreeNode root) {
		keepThisNode(root);
		return root;
    }
	
	public boolean keepThisNode(TreeNode node) {
		if (node.val == 0)
		{
			if(node.left == null && node.right == null)
			{
				return false;
			}
			else 
			{
				boolean left = false;
				boolean right = false;
				
				if (node.left != null) 
				{
					left = keepThisNode(node.left);
					if (!left)
						node.left = null;
				}
				
				if (node.right != null)
				{
					right = keepThisNode(node.right);
					if (!right)
						node.right = null;
				}
				
				return left || right;
			}
		}
		else {
			if(node.left != null)
			{
				boolean left = keepThisNode(node.left);
				if (!left)
					node.left = null;
			}
			
			if(node.right != null)
			{
				boolean right = keepThisNode(node.right);
				if (!right)
					node.right = null;
			}
			
			return true;
		}
	}
}
