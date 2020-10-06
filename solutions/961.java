class Solution {
    public int repeatedNTimes(int[] A) {
        int[] bucket = new int[10001];
        for (int i = 0; i < A.length; i++) {
            if (bucket[A[i]] == 1) {
                return A[i];
            }
            bucket[A[i]]++;
        }
        return 0;
    }
}