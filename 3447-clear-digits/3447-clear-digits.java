class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        int countd=0;
        StringBuilder sb=new StringBuilder(s);
        boolean flag=false;
        for(int i=n-1;i>=0;i--){
            char c=sb.charAt(i);
            if(c>='0' && c<='9'){
                countd++;
                sb.deleteCharAt(i);
            }
            else{
                if(countd>0){
                    sb.deleteCharAt(i);
                    countd--;
                }
            }
        }
        return sb.toString();
    }
}