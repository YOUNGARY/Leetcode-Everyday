class Solution {
    int depth = 0;

    public int maxDepth(Node root) {
        calcDepth(root, 0);
        return depth;
    }

    void calcDepth(Node root, int d) {
        if (root == null) {
            return;
        }
        depth = Integer.max(depth, d + 1);
        for (Node child : root.children) {
            calcDepth(child, d + 1);
        }
    }
}