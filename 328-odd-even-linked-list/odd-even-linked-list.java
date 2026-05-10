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
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode temp = head, oTemp = odd, eTemp = even;
        while(temp != null){
            oTemp.next = temp;
            temp = temp.next;
            oTemp = oTemp.next;

            eTemp.next = temp;
            if(temp == null) break;
            temp = temp.next;
            eTemp = eTemp.next;
        }
        odd = odd.next;
        even = even.next;
        oTemp.next = even;
        return odd;
    }
}