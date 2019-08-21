package solution;

public class Partition_List {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 5, 2 };
		int x = 3;
		ListNode head = new ListNode(arr[0]);
		ListNode p = head;
		for (int i = 1; i < arr.length; i++) {
			p.next = new ListNode(arr[i]);
			p = p.next;
		}
		ListNode res = partition(head, x);
		while (res != null) {
			System.out.print(res.val + "->");
			res = res.next;
		}
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode before = new ListNode(0);
		ListNode pb = before;
		ListNode after = new ListNode(0);
		ListNode pa = after;

		while (head != null) {
			if(head.val < x) {
				pb.next = head;
				pb = pb.next;
			}else {
				pa.next = head;
				pa = pa.next;	
			}	
			head = head.next;
		}
		pa.next=null;
		pb.next = after.next;
		return before.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}