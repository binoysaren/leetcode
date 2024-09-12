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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(ListNode a:lists){
           f(list,a);
        }
        Collections.sort(list);
         if (list.isEmpty()) {
            return null; 
        }
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }

        return head; 
    }
    public List<Integer> f(List<Integer> l,ListNode temp){
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        return l;
    }
}