package solution;

import java.util.HashMap;
import java.util.Map;

public class ConstructBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Map<Integer, Integer> map;
	int[] postorder;
	int pindex;

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		this.postorder = postorder;
		pindex = postorder.length - 1;
		return buildTree(0, pindex);
	}

	private TreeNode buildTree(int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode cur = new TreeNode(postorder[pindex]);
		pindex--;
		int inIndex = map.get(cur.val);
		cur.right = buildTree(inIndex + 1, end);
		cur.left = buildTree(start, inIndex - 1);
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