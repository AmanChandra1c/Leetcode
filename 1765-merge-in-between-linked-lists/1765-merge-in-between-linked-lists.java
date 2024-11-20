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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null) return null;
        if(list2 == null) return list1;
       ListNode curr = list1;
       ListNode prev = null;
       ListNode next = null;
       for(int i = 0; i <=b; i++){
            if(i < a) prev = curr;
            if(curr == null) return list1;
            curr = curr.next;
            next = curr;
       }
       prev.next = list2;
       curr = list2;
       while(curr.next != null){
        curr = curr.next;
       }
       curr.next = next;

       return list1;
    }
}