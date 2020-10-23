class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minI = m, minJ = n;

        for (int[] op : ops) {
            minI = Integer.min(op[0], minI);
            minJ = Integer.min(op[1], minJ);
        }

        return minI * minJ;
    }
}