class Solution {
    public int xorAllNums(int[] num1, int[] num2) {
        int a = num1.length;
        int b = num2.length;
        if ((a % 2 == 0 && b % 2 == 0 && a == b) || (a % 2 == 0 && b % 2 == 0))
            return 0;
        int ans = -1;
        int xor1 = num1[0];
        int xor2 = num2[0];
        for (int i = 1; i < a; i++) {
            xor1 ^= num1[i];
        }
        for (int i = 1; i < b; i++) {
            xor2 ^= num2[i];
        }
        if (a % 2 != 0 && b % 2 == 0) {
            return xor2;
        } else if (a % 2 != 0 && b % 2 != 0) {
            return xor1 ^ xor2;
        } else if (a % 2 == 0 && b % 2 != 0) {
            return xor1;
        }
        return 0;
    }
}