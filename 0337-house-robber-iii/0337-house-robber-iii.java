class Solution {
    public int rob(TreeNode root) {
        int[] temp = f(root);
        return Math.max(temp[0], temp[1]);
    }

    public int[] f(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] left = f(root.left);
        int[] right = f(root.right);
        int[] leftright = new int[2];
        leftright[0] = root.val + left[1] + right[1];
        leftright[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return leftright;
    }
}