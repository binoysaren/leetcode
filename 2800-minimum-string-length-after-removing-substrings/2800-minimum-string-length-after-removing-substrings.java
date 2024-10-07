class Solution {
    public int minLength(String s) {
       int n=s.length();
       Stack<Character> st=new Stack<>();
       for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(st.isEmpty()){
            st.push(c);
            continue;
        }
        if(c=='B' && st.peek()=='A'){
            st.pop();
        }
        else if(c=='D' && st.peek()=='C'){
            st.pop();
        }
        else{
            st.push(c);
        }
       }
       return st.size();
    }
}