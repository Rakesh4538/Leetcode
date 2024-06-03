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
        if(head == null || head.next == null || head.next.next == null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenStart = even; //This will be a marker of even-node start-point,using it we can join set of evennodes after the odd nodes
        
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = even.next;
            if(odd != null){
                even.next = odd.next;
                even = odd.next;
                
            }
        }
        odd.next = evenStart;
        return head;

        
    }
}