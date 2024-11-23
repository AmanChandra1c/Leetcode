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

    public ListNode getMid(ListNode head){
        ListNode mid = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            mid = mid.next;
            fast = fast.next.next;
        }
        return mid;
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode mergedLL = new ListNode(0);
        ListNode temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                 temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next;
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode newLeft = mergeSort(head);
        ListNode newRight = mergeSort(rightHead);

        return merge(newLeft , newRight);
    }
    

    public ListNode sortList(ListNode head) {
        head = mergeSort(head);
        return head;
    }
}