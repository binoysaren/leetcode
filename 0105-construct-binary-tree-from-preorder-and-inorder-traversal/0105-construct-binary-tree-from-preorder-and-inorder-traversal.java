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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        // Base case: if there are no elements to process
        if (preStart >= preorder.length || inStart > inEnd) return null;

        // Step 1: Find the root from preorder traversal
        TreeNode root = new TreeNode(preorder[preStart]);

        // Step 2: Find the index of root in inorder traversal
        int inIndex = 0; // Index of current root in inorder
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }

        // Step 3: Calculate the size of the left subtree
        int leftSize = inIndex - inStart;

        // Step 4: Recursively build the left and right subtrees
        root.left = constructTree(preorder, inorder, preStart + 1, inStart, inIndex - 1);
        root.right = constructTree(preorder, inorder, preStart + leftSize + 1, inIndex + 1, inEnd);

        return root;
    }
}
