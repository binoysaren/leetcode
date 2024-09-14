class Solution {
    public boolean queryString(String s, int n) {
        // int number = 0;
        // int len = s.length();
        // for (int i = 1; i <= n; i++) {
        // if (!s.contains(f(i))) {
        // return false;
        // }
        // }
        // return true;
        // }
        // public String f(int a) {
        // String b = "";
        // while (a > 0) {
        // b = (a % 2) + b;
        // a = a / 2;
        // }
        // return b;
        for(int i=1;i<=n;i++){
           String binoy=Integer.toBinaryString(i);
           if(!s.contains(binoy)){
            return false;
           }
        }
        return true;
    }
}