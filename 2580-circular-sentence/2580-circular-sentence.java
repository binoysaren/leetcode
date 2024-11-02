class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        int n=arr.length;
        String first=arr[0];
        char ch=first.charAt(first.length()-1);
        for(int i=1;i<n;i++){
            String temp=arr[i];
            if(ch!=temp.charAt(0)){
                return false;
            }
            else{
                ch=temp.charAt(temp.length()-1);
            }
        }
        return first.charAt(0)==arr[n-1].charAt(arr[n-1].length()-1);
    }
}