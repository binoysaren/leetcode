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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            map.put(current.val, map.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode newTail = dummy;
        current = head;
        while (current != null) {
            if (map.get(current.val) == 1) {
                newTail.next = new ListNode(current.val);
                newTail = newTail.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}