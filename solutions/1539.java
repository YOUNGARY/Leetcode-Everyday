class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] num = new int[2001];
        for (int j : arr) {
            num[j]++;
        }

        int pos = 1;
        for (int i = 1; pos <= k; i++) {
            if (num[i] == 0 && pos == k) {
                return i;
            } else if (num[i] == 0) {
                pos++;
            }
        }
        return 0;
    }
}