package solution;

public class Rotate_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Rotate_List rl = new Rotate_List();
		ListNode head = rl.new ListNode(1);
		int k = 1;
		ListNode p1 = head;
		for (int i = 2; i <= 5; i++) {
			p1.next = rl.new ListNode(i);
			p1 = p1.next;
		}
		head = rl.rotateRight(head, k);
		while (head != null) {
			System.out.print("->" + head.val);
			head = head.next;
		}
	}

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		ListNode start = head;
		ListNode last = head;
		ListNode beflast = head;
        int len = 1;
        while (last.next!=null){
            len++;
            last = last.next;
        }
        k%=len;
		while (k-- > 0) {
			while (head.next != null) {
				beflast = head;
				last = beflast.next;
				head = head.next;
			}
			last.next = start;
			start = last;
			beflast.next = null;
		}
		return start;
	}
}
