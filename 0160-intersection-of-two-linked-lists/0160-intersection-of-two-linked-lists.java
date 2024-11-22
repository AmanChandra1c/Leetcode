/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode one = headA;
        ListNode two = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(one != null && two != null){
            sizeA++;
            sizeB++;
            one = one.next;
            two = two.next;
        }
        while(one != null){
            sizeA++;
            one = one.next;
        }
        while(two != null){
            sizeB++;
            two = two.next;
        }
        int gap = Math.abs(sizeA - sizeB);
        
        one = headA;
        two = headB;

        if(sizeA > sizeB){
            for(int i = 0; i < gap; i++){
                one = one.next;
            }
        }
        else{
            for(int i = 0; i < gap; i++){
                two = two.next;
            }
        }  

        while(two != null && one != null){
            if(two == one) return one;
            one = one.next;
            two = two.next;
        }
        return null;
    }
}