class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> temp = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            long sum=0;
            int n=q.size();
            for (int i = 0; i < n; i++) {
                TreeNode tree = q.poll();
                sum += tree.val;
                if (tree.left != null) {
                    q.add(tree.left);
                }
                if (tree.right != null) {
                    q.add(tree.right);
                }
            }
            temp.add(sum);
        }
        if (k > temp.size())
            return -1;
        Collections.sort(temp);
        System.out.println(temp);
        return temp.get(temp.size() - k);
    }
}