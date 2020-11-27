class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int len = height.length;
        int left = 0, right = len - 1;
        while (left < right) {
            ans = Integer.max(ans, (right - left) * Integer.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}