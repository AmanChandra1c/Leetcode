/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode curr = dummy;
        while(fast != null && fast.next != null){
            curr.next = fast;
            slow.next = fast.next;

            slow = slow.next;
            fast = fast.next.next;
            curr = curr.next;
        }
        if(fast != null){
             curr.next = fast;
             curr = curr.next;
        }
        curr.next = null;
        slow.next = dummy.next;

        return head;
    }
}