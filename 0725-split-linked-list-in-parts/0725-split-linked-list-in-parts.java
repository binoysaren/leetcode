class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        int ps = count / k;
        int ep = count % k;
        for (int i = 0; i < k; i++) {
            if (current == null)
                ans[i] = null;
            else {
                ans[i] = current;
                int cps = ps + (ep > 0 ? 1 : 0);
                ep--;
                for (int j = 1; j < cps; j++) {
                    if (current != null) {
                        current = current.next;
                    }
                }
                if (current != null) {
                    ListNode np = current.next;
                    current.next = null;
                    current = np;
                }

            }
        }
        return ans;
    }
}