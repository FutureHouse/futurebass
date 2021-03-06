package solution;

import java.util.HashMap;
import java.util.Map;

public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Map<Integer, Integer> map;
	private int[] preorder;
	private int pindex = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		this.preorder = preorder;
		return buildTree(0, preorder.length - 1);
	}

	public TreeNode buildTree(int start, int end) {
		if (start > end)
			return null;
		TreeNode cur = new TreeNode(preorder[pindex]);
		pindex++;
		int inIndex = map.get(cur.val);
		cur.left = buildTree(start, inIndex - 1);
		cur.right = buildTree(inIndex + 1, end);
		return cur;
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