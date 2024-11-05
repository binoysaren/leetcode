class Solution {
public:
    int minChanges(string s) {
        int n = s.length();
        if(n == 0) return 0;
        int ans = 0;
        int count = 0;
        char prev = s[0];
        for(int i = 0; i < n; i++) {
            if(prev == s[i]) count++;
            else {
                if(count % 2 == 0) {
                    count = 1;
                    prev = s[i];
                }
                else  {
                    count = 0;
                    ans += 1;
                    prev = s[i];
                }
            }
        }
        if(count % 2) ans += 1;
        return ans;
    }
};