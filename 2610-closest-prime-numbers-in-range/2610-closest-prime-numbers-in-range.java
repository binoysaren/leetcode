class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[2];
        for (int i = left; i <= right; i++) {
            if (f(i)) {
                list.add(i);
            }
        }
        int temp = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;
        int n = list.size();
        // System.out.println(list);
        // if (n == 1)
        //     return new int[] { -1, -1 };
        for (int i = n-1; i >=1; i--) {
            int current = list.get(i) - list.get(i - 1);
            temp = Math.min(temp, current);
            if (temp >= current) {
                num1 = list.get(i - 1);
                num2 = list.get(i);
            }
        }
        ans[0] = num1;
        ans[1] = num2;
        return ans;
    }

    public boolean f(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}