class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) != d) {
                return false;
            }
        }
        return true;
    }
}