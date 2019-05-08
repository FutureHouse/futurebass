package solution;

public class Same_Tree {
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

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if ((p == null && q != null) || (p != null && q == null))
			return false;
		if (p == null && q == null)
			return true;
       if(p.val!=q.val)return false;
		return isSameLeft(p, q) && isSameRight(p, q);

	}

	public static boolean isSameLeft(TreeNode p, TreeNode q) {
		TreeNode p1 = p.left;
		TreeNode q1 = q.left;
		if ((p1 == null && q1 != null) || (p1 != null && q1 == null))
			return false;
		if (p1 == null && q1 == null)
			return true;
		if (p1.val != q1.val) {
			return false;
		}
		return isSameLeft(p.left, q.left);
	}

	public static boolean isSameRight(TreeNode p, TreeNode q) {
		TreeNode p1 = p.right;
		TreeNode q1 = q.right;
		if ((p1 == null && q1 != null) || (p1 != null && q1 == null))
			return false;
		if (p1 == null && q1 == null)
			return true;
		if (p1.val != q1.val) {
			return false;
		}
		return isSameRight(p.right, q.right);
	}
}
