package solution;

public class Maximum_Depth_of_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
