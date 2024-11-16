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
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        BigInteger sum = BigInteger.ZERO;
        while(curr != null){
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(curr.val));
            curr = curr.next;
        }
        sum = sum.multiply(BigInteger.valueOf(2));
        String s = String.valueOf(sum);
        String a[] = s.split("");
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        for(String i : a){
            ListNode node = new ListNode(Integer.parseInt(i));
           
            dum.next =  node;
            dum = dum.next;
        }
        return dummy.next;
    }
}