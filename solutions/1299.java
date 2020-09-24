class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length, maxNum = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] > maxNum) {
                int temp = maxNum;
                maxNum = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = maxNum;
            }
        }
        arr[len - 1] = -1;
        return arr;
    }
}