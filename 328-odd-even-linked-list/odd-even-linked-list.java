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
        ListNode h = head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(0);
        ListNode oTemp = odd, eTemp = even;
        int i = 1;
        while(h != null){
            
            ListNode a = new ListNode(h.val);
            if(i%2 == 0){
                eTemp.next = a;
                eTemp = eTemp.next;                
            } else {
                oTemp.next = a;
                oTemp = oTemp.next;               
            }
            h = h.next;
            i++;
        }
        oTemp.next = even.next;
        eTemp.next = null;
        return odd.next;
    }
}