package solution;

public class Remove_Nth_Node {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int n = 5;
		Remove_Nth_Node rnn = new Remove_Nth_Node();
		ListNode head = rnn.new ListNode(nums[0]);
		ListNode p = head;
		for (int i = 1; i < nums.length; i++) {
			p.next = rnn.new ListNode(nums[i]);
			p = p.next;
		}

		ListNode result = rnn.removeNthFromEnd(head, n);
		while (result != null) {
			System.out.print(result.val + "->");
			result = result.next;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return new ListNode(0);
		ListNode p = head;
		int len = 0;
		while (p != null) {
			p = p.next;
			len++;
		}
		if (len == n)
			return head.next;
		// System.out.println(len);
		p = head;
		for (int i = 0; i < len - n - 1; i++) {
			p = p.next;
		}
		p.next = p.next.next;
		return head;
	}

}
