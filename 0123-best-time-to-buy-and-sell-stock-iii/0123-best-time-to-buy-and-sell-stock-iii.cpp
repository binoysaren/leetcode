class Solution {
public:
int f(int i,vector<int> &prices,int cb,vector<vector<vector<int>>>& v,int k){
        if(i==prices.size()) return 0;
        if(k==2) return 0;
        if(v[i][cb][k]!=-1) return v[i][cb][k];
        int p;
        if(cb){
            p=max(-prices[i]+f(i+1,prices,0,v,k),f(i+1,prices,1,v,k));
        }
        else p=max(prices[i]+f(i+1,prices,1,v,k+1),f(i+1,prices,0,v,k));
        return v[i][cb][k]=p;
    }
    int maxProfit(vector<int>& prices) {
        vector<vector<vector<int>>> v(prices.size(),vector<vector<int>>(2,vector<int>(3,-1)));
        return f(0,prices,1,v,0);
    }
};