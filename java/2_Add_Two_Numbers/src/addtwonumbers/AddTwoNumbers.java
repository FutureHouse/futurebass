package addtwonumbers;

public class AddTwoNumbers {
	public class ListNode {
		/**
		 * Definition for singly-linked list.
		 */
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
		//Modification of parameters is required
		
		int[] l1 = {2,4,5};
		int[] l2 = {3,5,7,9,1};
		
		AddTwoNumbers atn = new AddTwoNumbers();
		ListNode l1node = atn.new ListNode(0);
		ListNode l2node = atn.new ListNode(0);
		ListNode p = l1node;
		ListNode q = l2node;			
		for(int i = 0; i < l1.length; i++) {
			p.next = atn.new ListNode(l1[i]);
			p = p.next;
		}
		for(int i = 0; i < l2.length; i++) {
			q.next = atn.new ListNode(l2[i]);
			q = q.next;
		}
		for(ListNode result = atn.addTwoNumbers(l1node.next, l2node.next);
				result != null; result = result.next) {
			System.out.print("->" + result.val);
		}
			
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//runtime 2ms, 46.1MB memory used
		int carry = 0, x = 0, y = 0 ,sum = 0;
		ListNode result = new ListNode(0);
		ListNode p = l1, q=l2, r=result;
		while( p !=null || q != null ) {
			x = (p == null) ? 0 : p.val;
			y = (q == null) ? 0 : q.val;
			sum = carry + x + y;
			carry = sum/10;
			r.next = new ListNode(sum % 10);
			r = r.next;
			if(p != null) p = p.next;
			if(q != null) q = q.next;
			
		}
		if(carry > 0) {
			r.next = new ListNode(carry);
		}
		return result.next;
    }
}
