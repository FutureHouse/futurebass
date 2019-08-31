package solution;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isValidBST(TreeNode root) {
		return isValid(root, null, null);
	}

	public static boolean isValid(TreeNode root, TreeNode left, TreeNode right) {
		if (root == null) {
			return true;
		}	
		if (left != null && root.val <= left.val) {
			return false;
		}

		if (right != null && root.val >= right.val) {
			return false;
		}
		if (!isValid(root.right, root, right)) {
			return false;
		}
		if (!isValid(root.left, left, root)) {
			return false;
		}
		return true;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}