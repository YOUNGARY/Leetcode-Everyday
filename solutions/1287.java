class Solution {
    public int findSpecialInteger(int[] arr) {
        int times = arr.length / 4 + 1;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i + times - 1 < len && arr[i] == arr[i + times - 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}