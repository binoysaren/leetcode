class Solution {
    int rows,cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image,int r,int c,int newcolor,int curcolor){
        if(r<0 || r>=rows || c<0 || c>=cols || image[r][c] !=curcolor || image[r][c]==newcolor){
            return;
        }
        image[r][c]=newcolor;
        int[][] adjlist={{r,c+1},{r,c-1},{r-1,c},{r+1,c}};
        for(int[] neighbor:adjlist){
            dfs(image,neighbor[0],neighbor[1],newcolor,curcolor);
        }
    }
}