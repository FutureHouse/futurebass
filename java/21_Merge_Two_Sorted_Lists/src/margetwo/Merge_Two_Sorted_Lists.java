package margetwo;

import java.util.ArrayList;
import java.util.Collections;

public class Merge_Two_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 4 };
		int[] num2 = { 1, 3, 4 };
		Merge_Two_Sorted_Lists mtsl = new Merge_Two_Sorted_Lists();
		ListNode l1 = mtsl.new ListNode(num1[0]);
		ListNode l1start = l1;
		ListNode l2 = mtsl.new ListNode(num2[0]);
		ListNode l2start = l2;
		for (int i = 1; i < num1.length; i++) {
			l1.next = mtsl.new ListNode(num1[i]);
			l1 = l1.next;
		}
		for (int i = 1; i < num2.length; i++) {
			l2.next = mtsl.new ListNode(num2[i]);
			l2 = l2.next;
		}

		ListNode l3 = mtsl.mergeTwoLists(l1start, l2start);
		while (l3 != null) {
			System.out.print(l3.val);
			l3 = l3.next;
		}
		System.out.println("");
		l3 = mtsl.mergeTwoLists_2(l1start, l2start);
		while (l3 != null) {
			System.out.print(l3.val);
			l3 = l3.next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ArrayList<Integer> li = new ArrayList<>();
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				li.add(l1.val);
				l1 = l1.next;
			} else {
				li.add(l2.val);
				l2 = l2.next;
			}
		}
		Collections.sort(li);
		ListNode l3 = new ListNode(0);
		ListNode ltemp = l3;
		for (int val : li) {
			l3.next = new ListNode(val);
			l3 = l3.next;
		}
		return ltemp.next;

	}

	public ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists_2(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists_2(l1, l2.next);
			return l2;
		}
	}
}
