class Solution {
    public String removeStars(String s) {
     Stack<Character> result=new Stack<>();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i) != '*'){
            result.push(s.charAt(i));
        }
        else{
            result.pop();
        }
     }   
     for(char c : result){
        sb.append(c);
     }
     return sb.toString();
    }
}