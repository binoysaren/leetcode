class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int g = goal.length();
        if (n != g)
            return false;
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=s.substring(i)+s.substring(0,i);
            list.add(str);
        }
        return list.contains(goal);
    }
}