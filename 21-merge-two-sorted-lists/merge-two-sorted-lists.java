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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempA = list1, tempB = list2;
        ListNode merged = new ListNode(0);
        ListNode temp = merged;
        while(tempA != null && tempB != null){
            if(tempA.val < tempB.val) {
                ListNode a = new ListNode(tempA.val);
                temp.next = a;
                temp = a;
                tempA = tempA.next;
            } else {
                ListNode a = new ListNode(tempB.val);
                temp.next = a;
                temp = a;
                tempB = tempB.next;
            }
        }
        if(tempA == null) temp.next = tempB;
        else temp.next =  tempA;
        return merged.next;
    }
}