package solution;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3 };
		ListNode head = new ListNode(arr[0]);
		ListNode p = head;
		for (int i = 1; i < arr.length; i++) {
			p.next = new ListNode(arr[i]);
			p = p.next;
		}

		ListNode head2 = deleteDuplicates(head);
		while (head2 != null) {
			System.out.print(head2.val + "->");
			head2 = head2.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode curr = head;
		ListNode perv = null;
		ListNode next = curr.next;
		while (curr != null) {
			next = curr.next;
			while (next != null && curr.val == next.val) {
				next = next.next;
			}
			if (curr.next == next) {
				perv = curr;
				curr = curr.next;

			} else {
				if (perv == null)
					head = next;
				else
					perv.next = next;
				curr = next;
			}
		}
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