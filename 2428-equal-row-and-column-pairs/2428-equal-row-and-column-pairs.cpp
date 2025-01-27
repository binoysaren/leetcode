class Solution {
public:
    int equalPairs(vector<vector<int>>& grid) {
        map<vector<int>, int> map;
        int n = grid.size();
        int m = grid[0].size();
        for(int i = 0; i < n; i++)
        {
            map[grid[i]]++;
        }
        int ans = 0;
        for(int i = 0; i < m; i++)
        {
            vector<int> v;
            for(int j = 0; j < n; j++)
            {
                v.push_back(grid[j][i]);
                ans += map[v];
            }
        }
        return ans;
    }
};