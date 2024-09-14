class Solution {
    public boolean queryString(String s, int n) {
        int number = 0;
        int len = s.length();
        for (int i = 1; i <= n; i++) {
            if (!s.contains(f(i))) {
                return false;
            }
        }
        return true;
    }
      public String f(int a) {
        StringBuilder b = new StringBuilder();
        while (a > 0) {
            b.insert(0, a % 2); 
            a = a / 2;
        }
        return b.toString();
    }
}