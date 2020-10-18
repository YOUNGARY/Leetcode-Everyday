class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int fivePctNum = (int) (len * 0.05);
        int sum = 0;
        for (int i = fivePctNum; i < len - fivePctNum; i++) {
            sum += arr[i];
        }
        return (double) (sum) / (len - 2 * fivePctNum);

    }
}