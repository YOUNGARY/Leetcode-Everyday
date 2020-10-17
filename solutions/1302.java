class Solution {
    int sum = 0;
    int level = 0;
    public int deepestLeavesSum(TreeNode root) {
        findMaxLevel(root, 0);
        helper(root, 0);
        return sum;
    }
    
    public void findMaxLevel(TreeNode root, int level) {
        if (root == null) return ;
        if (this.level < level) {
            this.level = level;
        }
        
        findMaxLevel(root.left, level + 1);
        findMaxLevel(root.right, level + 1);
    }

    public void helper(TreeNode root, int level) {
        if (root == null) return;

        if (level == this.level) {
            sum += root.val;
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}