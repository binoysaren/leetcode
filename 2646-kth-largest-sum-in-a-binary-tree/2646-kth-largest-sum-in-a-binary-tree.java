class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<List<Integer>> list = new ArrayList<>();
        levelorder(root, list);
        List<Long> temp = new ArrayList<>();
        for (List<Integer> li : list) {
            long sum = 0;
            for (int i : li) {
                sum += i;
            }
            temp.add(sum);
        }
        Collections.sort(temp);
        System.out.println(temp);
        if(k>temp.size()) return -1;
        return temp.get(temp.size()-k);
    }

    public void levelorder(TreeNode root, List<List<Integer>> list) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> l=new ArrayList<>();
             int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode tree = q.poll();
                l.add(tree.val);
                if (tree.left != null) {
                    q.add(tree.left);
                }
                if (tree.right != null) {
                    q.add(tree.right);
                }
            }
            list.add(l);
        }
    }
}