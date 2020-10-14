class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int k : arr2) {
                if (Math.abs(arr1[i] - k) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum++;
            }
        }
        return sum;
    }
}