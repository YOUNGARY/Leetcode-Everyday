class Solution {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        treeSum(root, root.right);
        treeSum(root, root.left);
        return sum;
    }
    
    void treeSum(TreeNode grandparent, TreeNode parent) {
        if (parent == null) {
            return;
        }
        if (grandparent.val % 2 == 0 && parent.left != null) {
            sum += parent.left.val;
        }
        if (grandparent.val % 2 == 0 && parent.right != null) {
            sum += parent.right.val;
        }
        treeSum(parent, parent.left);
        treeSum(parent, parent.right);
    }
}