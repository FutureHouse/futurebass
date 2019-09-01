package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree {

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root == null) return res;
		List<Integer> li =  new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
				TreeNode n = queue.poll();
				li.add(n.val);
				if(n.left != null) {
					queue.offer(n.left);
				}
				if(n.right !=null) {
					queue.offer(n.right);
				}
			}
			if(!li.isEmpty()) {
				res.add(new ArrayList<>(li));
				li.clear();
			}
		}
		return res;
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