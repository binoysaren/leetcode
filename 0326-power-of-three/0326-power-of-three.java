class Solution {
    public boolean isPowerOfThree(int n) {
       if (n <= 0) return false;
       return f(n,1);
    }
    public boolean f(int n,long a){
        if (a == n) return true;
        if (a > n) return false;
        return f(n, a * 3);
    }
}