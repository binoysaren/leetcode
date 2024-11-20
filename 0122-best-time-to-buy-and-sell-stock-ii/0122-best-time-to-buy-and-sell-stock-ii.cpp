class Solution {
public:
int f(int i,vector<int> &prices,int cb,vector<vector<int>>& v){
        if(i==prices.size()) return 0;
        if(v[i][cb]!=-1) return v[i][cb];
        int p;
        if(cb){
            p=max(-prices[i]+f(i+1,prices,0,v),f(i+1,prices,1,v));
        }
        else p=max(prices[i]+f(i+1,prices,1,v),f(i+1,prices,0,v));
        return v[i][cb]=p;
    }
    int maxProfit(vector<int>& prices) {
        vector<vector<int>> v(prices.size(),vector<int>(2,-1));
        return f(0,prices,1,v);
    }
};