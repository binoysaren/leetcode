/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        if (n == len) {
            return head.next;
        }
        current = head;
        int count = 0;
        while (current != null) {
            count++;
            if (count == len - n) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return head;
    }
}