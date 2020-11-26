class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += oddArrayNums(i, len) * arr[i];
        }
        return sum;
    }

    int oddArrayNums(int idx, int len) {
        int leftEven = idx / 2 + 1;
        int rightEven = (len - idx - 1) / 2 + 1;
        int leftOdd = (idx + 1) / 2;
        int rightOdd = (len - idx) / 2;
        return leftEven * rightEven + leftOdd * rightOdd;
    }
}