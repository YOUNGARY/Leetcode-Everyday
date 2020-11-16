class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                ans[i] ^= arr[j];
            }
        }
        return ans;
    }
}