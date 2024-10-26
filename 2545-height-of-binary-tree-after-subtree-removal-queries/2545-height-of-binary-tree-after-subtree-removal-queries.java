/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max;
    public int[] treeQueries(TreeNode root, int[] queries) {
      int n=queries.length;
      int[] left=new int[100001] ;
      int[] right=new int[100001];
      max=0;
      leftside(root,left,0);
      max=0;
      rightside(root,right,0);
      int[] ans=new int[n];
      for(int i=0;i<n;i++){
        ans[i]=Math.max(left[queries[i]],right[queries[i]]);
      }
      return ans;
    }
    public void leftside(TreeNode root,int[] left,int h){
        if(root==null) return;
        left[root.val]=max;
        max=Math.max(max,h);
        leftside(root.left,left,h+1);
        leftside(root.right,left,h+1);
    } 
     public void rightside(TreeNode root,int[] right,int h){
        if(root==null) return;
        right[root.val]=max;
        max=Math.max(max,h);
        rightside(root.right,right,h+1);
        rightside(root.left,right,h+1);
    } 
}