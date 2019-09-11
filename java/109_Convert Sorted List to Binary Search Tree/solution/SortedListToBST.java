package solution;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		List<Integer> li = new ArrayList<>();
		while (head != null) {
			li.add(head.val);
			head = head.next;
		}
		return helper(li, 0, li.size());
	}

	TreeNode helper(List<Integer> li, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		TreeNode cur = new TreeNode(li.get(mid));
		cur.left = helper(li, start, mid - 1);
		cur.right = helper(li, mid + 1, end);
		return cur;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
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
