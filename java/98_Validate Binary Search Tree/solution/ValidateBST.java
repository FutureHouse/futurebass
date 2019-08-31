package solution;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isValidBST(TreeNode root) {
		if (root == null)
			return false;
		return isValid(root);
	}

	public static boolean isValid(TreeNode root) {
		if (root.left != null && root.right != null) {
			boolean l = true, r = true;
			if (root.val <= root.left.val)
				return false;
			l = isValid(root.left);
			if (root.val >= root.right.val)
				return false;
			r = isValid(root.right);
			return l && r;
		} else if (root.left == null && root.right == null) {
			return true;
		}
		return false;
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