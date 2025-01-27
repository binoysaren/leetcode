class Solution {
public:
    string removeStars(string s) {
        int n = s.size();
        stack<char> st;
        for(int i = 0; i < n; i++)
        {
            st.push(s[i]);
            if(s[i] == '*')
            {
                st.pop();
                st.pop();
            }
        }
        string ans = "";
        while(! st.empty())
        {
            ans += st.top();
            st.pop();
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};