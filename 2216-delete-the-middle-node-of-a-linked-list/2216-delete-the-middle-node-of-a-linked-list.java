class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        current=head;
        int mid=count/2;
        ListNode pre = null;
        for (int i = 0; i < mid; i++) {
            pre = current;
            current = current.next;
        }
        pre.next=current.next;
        return head;
    }
}