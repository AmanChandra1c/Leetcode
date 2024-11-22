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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n = k;
        ListNode curr = head;
        ListNode first = head;
        ListNode last = head;
        while(k > 1){
            last = last.next;
            k--;
        }
        while(last.next != null){
            first = first.next;
            last = last.next;
        }
        last = first;
        first = head;

        while(n > 1){
            first = first.next;
            n--;
        }
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        return head;
    }
}