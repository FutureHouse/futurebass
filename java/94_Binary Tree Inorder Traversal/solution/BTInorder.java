package solution;

import java.util.ArrayList;
import java.util.List;

public class BTInorder {

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;
		find(res, root);
		return res;
	}

	public void find(List<Integer> res, TreeNode root) {
		if (root.left != null) {
			find(res, root.left);
		}
		res.add(root.val);
		if (root.right != null) {
			find(res, root.right);
		}
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