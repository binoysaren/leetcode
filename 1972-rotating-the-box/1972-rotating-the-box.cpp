class Solution {
public:
    vector<vector<char>> rotateTheBox(vector<vector<char>>& box) {
        int n=box.size();
        int m=box[0].size();
        int count=0;
        vector<vector<char>>ans(m,vector<char>(n,'.'));
        int x=0,y=0;
        for(int i=0;i<n;i++,y++){
            for(int j=0;j<m;j++){
                if(box[i][j]=='#')count++;
                if(box[i][j]=='*'){
                    x=j;
                    
                    ans[x][y]='*';
                    x--;
                    while(count){
                        ans[x][y]='#';
                        count--;
                        x--;
                    }
                 }
            }
             x=m-1;
                    while(count){
                        ans[x][y]='#';
                        count--;
                        x--;
                    }
        }
         vector<vector<char>>ans2(m,vector<char>(n,'.'));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans2[i][j]=ans[i][n-j-1];
            }
        }
        return ans2;
    }
};