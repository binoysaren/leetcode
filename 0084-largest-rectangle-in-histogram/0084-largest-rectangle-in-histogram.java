class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps=new int[n];
        int[] ns=new int[n];
        presmaller(ps,heights,n);
        nextsmaller(ns,heights,n);
        int ans=-1;
        for(int i=0;i<n;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            ans=Math.max(ans,curr);
        }
        return ans;
    }
    public void presmaller(int[] ps,int[] h,int n){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n; i++) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();  
            }
            ps[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
    }
    public void nextsmaller(int[] ns,int[] h,int n){
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();  
            }
            ns[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
    }
}