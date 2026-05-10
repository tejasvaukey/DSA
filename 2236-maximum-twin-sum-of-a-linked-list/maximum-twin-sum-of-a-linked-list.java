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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null, after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        int sum = 0;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList(slow.next);
        slow.next = temp;
        ListNode p1 = head, p2 = slow.next;
        while(p2 != null){
            int currSum = p1.val + p2.val;
            if(currSum > sum) sum = currSum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return sum;
    }
}