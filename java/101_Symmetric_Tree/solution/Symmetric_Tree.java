package solution;

public class Symmetric_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Symmetric_Tree st = new Symmetric_Tree();
		int[] nums = {1,2,2,3,4,4,3};
		TreeNode tn = st.new TreeNode(nums[0]);
		TreeNode p = tn;
		
		
	}

	public boolean isSymmetric(TreeNode root) {
		TreeNode p = root;
		if(p.left.left != p.right.right || p.left.right !=p.right.left) {
			return false;
		}
		return isSymmetric(p.left)&&isSymmetric(p.right);
	}
	private boolean isSame(TreeNode root) {
		
	}
}
