package leetcode;

//https://leetcode.com/problems/linked-list-cycle/

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode head1 = head;
        ListNode head2 = head.next;

        int count = 0;

        while(head2!= null && head2.next != null)
        {
            if(head2 == head1) return true;



            head1 = head1.next;
            head2 = head2.next.next;

            count++;
        }

        return false;
    }
}
