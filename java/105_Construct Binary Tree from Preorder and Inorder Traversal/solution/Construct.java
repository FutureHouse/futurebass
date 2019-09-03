package solution;

import java.util.HashMap;
import java.util.Map;

public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Map<Integer, Integer> map;
	private int[] preorder;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		this.preorder = preorder;
		return buildTree(preorder.length, 0, 0);
	}

	public TreeNode buildTree(int len, int pindex, int iindex) {
		if (len <= 0)
			return null;
		TreeNode root = new TreeNode(preorder[pindex]);
		int rootIndex = map.get(root.val);
		int ilen = rootIndex - iindex;
		root.left = buildTree(ilen, pindex + 1, iindex);
		root.right = buildTree(len - 1 - ilen, pindex + 1 + ilen, rootIndex + 1);
		return root;
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