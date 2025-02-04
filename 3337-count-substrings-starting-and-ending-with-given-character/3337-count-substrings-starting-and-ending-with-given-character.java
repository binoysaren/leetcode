class Solution {
    public long countSubstrings(String s, char c) {
        int n=s.length();
        long count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==c){
                count++;
            }
        }   
        return (count*(count-1)/2)+count;
    }
   
}
