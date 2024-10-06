class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
       if(sentence1.length()>sentence2.length()){
        return areSentencesSimilar(sentence2,sentence1);
       } 
       String[] small=sentence1.split(" ");
       String[] large=sentence2.split(" ");
       int left=0;
       int right1=small.length-1;
       int right2=large.length-1;
       while(left<=right1 && small[left].equals(large[left])){
        left++;
       }
       while(left<=right1 && small[right1].equals(large[right2])){
        right1--;
        right2--;
       }
       return left>right1;
    }
}