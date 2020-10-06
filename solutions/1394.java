class Solution {
    public int findLucky(int[] arr) {
        int[] luckyCount = new int[501];
        for (int a : arr) {
            luckyCount[a]++;
        }
        for (int i = 500; i > 0; i--) {
            if (luckyCount[i] == i) {
                return i;
            }
        }
        return -1;
    }
}