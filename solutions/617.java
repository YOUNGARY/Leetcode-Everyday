class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 != null) {
            t1.val += t2.val;
            if (t1.left != null && t2.left != null) {
                t1.left = mergeTrees(t1.left, t2.left);
            } else if (t1.left == null && t2.left != null) {
                t1.left = t2.left;
            }

            if (t1.right != null && t2.right != null) {
                t1.right = mergeTrees(t1.right, t2.right);
            } else if (t1.right == null && t2.right != null) {
                t1.right = t2.right;
            }
        } else {
            return t1 == null ? t2 : t1;
        }
        return t1;
    }
}