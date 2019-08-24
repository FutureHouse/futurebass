package solution;

public class Reverse_Linked_List_II {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int m = 2;
		int n = 4;
		ListNode head = new ListNode(nums[0]);
		ListNode p = head;
		for (int i = 1; i < nums.length; i++) {
			p.next = new ListNode(nums[i]);
			p = p.next;
		}
		ListNode res = reverseBetween(head, m, n);
		while (res != null) {
			System.out.print(res.val + "->");
			res = res.next;
		}
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {

		// Empty list
		if (head == null) {
			return null;
		}

		// Move the two pointers until they reach the proper starting point
		// in the list.
		ListNode cur = head, prev = null;
		while (m > 1) {
			prev = cur;
			cur = cur.next;
			m--;
			n--;
		}

		// The two pointers that will fix the final connections.
		ListNode con = prev, tail = cur;

		// Iteratively reverse the nodes until n becomes 0.
		ListNode third = null;
		while (n > 0) {
			third = cur.next;
			cur.next = prev;
			prev = cur;
			cur = third;
			n--;
		}

		// Adjust the final connections as explained in the algorithm
		if (con != null) {
			con.next = prev;
		} else {
			head = prev;
		}

		tail.next = cur;
		return head;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}