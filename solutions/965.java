class Solution {
    public boolean isUnivalTree(TreeNode root) {
        boolean l = true, r = true;
        if (root == null) {
            return true;
        } else {
            if (root.left != null) {
                l = root.left.val == root.val;
            }
            if (root.right != null) {
                r = root.right.val == root.val;
            }
        }

        return r && l && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}