class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (f(s.charAt(i))) {
                count++;
            }
        }
        int ans = count;
        System.out.println(count);
        int n = s.length();
        for (int i = 1; i <= n - k; i++) {
            char first = s.charAt(i-1);
            char last = s.charAt(i + k-1);
            if (f(first)) {
                count--;
            }
            if (f(last)) {
                count++;
            }
            ans = Math.max(ans, count);
            System.out.println(count+" "+ans);
        }
        return ans;
    }

    public boolean f(char c){
       return  (c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u');
    }
}