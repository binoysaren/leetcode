class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode current=head;
       while(current!=null && current.next!=null){
         ListNode newnode =new ListNode(gcd(current.val,current.next.val));
         ListNode nextp=current.next;
         current.next=newnode;
         newnode.next=nextp;
         current=nextp;
       }
       return head;
    }
    public int gcd(int x,int y){
       if(y==0) return x;
       return gcd(y,x%y);
    }
}