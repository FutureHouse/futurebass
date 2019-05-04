package solution;

public class Swap_Nodes_in_Pairs {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode p1 = head;
		ListNode p2 = p1.next;
		ListNode p3 = p2.next;
		head = p2;
		if (p3 == null) {
			p2.next = p1;
			p1.next = null;
		} else {
			p2.next = p1;
			p1.next = swapPairs(p3);
		}
		return head;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Swap_Nodes_in_Pairs snip = new Swap_Nodes_in_Pairs();
		ListNode li = snip.new ListNode(nums[0]);
		ListNode p = li;
		for (int i = 1; i < nums.length; i++) {
			p.next = snip.new ListNode(nums[i]);
			p = p.next;
		}
		li = snip.swapPairs(li);
		while (li != null) {
			System.out.print(li.val + "->");
			li = li.next;
		}
	}

}
