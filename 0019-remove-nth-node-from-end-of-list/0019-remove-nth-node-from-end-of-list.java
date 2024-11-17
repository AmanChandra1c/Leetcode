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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0) return head;
        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i < n; i++){
            if(fast == null) return head;
            fast = fast.next;
        }
        if(fast == null) return head.next;
        ListNode temp = null;
        while(fast != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow.next == null) temp.next = null;
        else temp.next = slow.next;

        return head;
    }
}