class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int maxN = -2;
        for (int i = 0; i < nums1.length; i++) {
            maxN = -2;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    maxN = -1;
                } else if (nums1[i] < nums2[j] && maxN == -1) {
                    maxN = nums2[j];
                }
            }
            ans[i] = maxN;
        }
        
        return ans;
    }
}