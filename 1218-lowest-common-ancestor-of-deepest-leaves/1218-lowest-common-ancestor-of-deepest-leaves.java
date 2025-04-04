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
    List<int[]> nodes = new ArrayList<>();
    int maxDepth = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        collect(root, 0);
        List<Integer> deepestLeaves = new ArrayList<>();

    for (int[] entry : nodes) {
    if (entry[3] == maxDepth) {
        if (entry[1] != -1) deepestLeaves.add(entry[1]);
        if (entry[2] != -1) deepestLeaves.add(entry[2]);
        if (entry[1] == -1 && entry[2] == -1) deepestLeaves.add(entry[0]); 
    }
    }


    return findLCA(root, new HashSet<>(deepestLeaves));
    }

    private void collect(TreeNode node, int depth) {
    if (node == null) return;
    if (node.left == null && node.right == null) {
        maxDepth = Math.max(maxDepth, depth);
        nodes.add(new int[]{node.val, -1, -1, depth}); 
        return;
    }
    if (node.left != null && node.right != null &&
        isLeaf(node.left) && isLeaf(node.right)) {
        maxDepth = Math.max(maxDepth, depth + 1);
        nodes.add(new int[]{node.val, node.left.val, node.right.val, depth + 1});
    }

    collect(node.left, depth + 1);
    collect(node.right, depth + 1);
}
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private TreeNode findLCA(TreeNode root, Set<Integer> targets) {
        if (root == null) return null;
        if (targets.contains(root.val)) return root;

        TreeNode left = findLCA(root.left, targets);
        TreeNode right = findLCA(root.right, targets);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}