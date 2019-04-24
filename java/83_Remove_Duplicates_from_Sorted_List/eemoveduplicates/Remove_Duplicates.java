package eemoveduplicates;

public class Remove_Duplicates {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] li1 = { 1, 1, 2, 3, 3, 5 };
		Remove_Duplicates rd = new Remove_Duplicates();
		ListNode listnode1 = rd.new ListNode(li1[0]);
		ListNode p1 = listnode1;
		for (int i = 1; i < li1.length; i++) {
			p1.next = rd.new ListNode(li1[i]);
			p1 = p1.next;
		}
		p1 = rd.deleteDuplicates(listnode1);
		while (p1 != null) {
			System.out.print(p1.val);
			p1 = p1.next;
		}

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode result = head;
		while (head.next != null) {
			if (head.next.val == head.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return result;
	}
}
