class Solution {
    public int maxProduct(int[] nums) {
        int temp = 0, len = nums.length;
        // Use BubbleSort, the first two sorted elements are the answer
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return (nums[len - 1] - 1) * (nums[len - 2] - 1);
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        // Get the two maximum numbers in one loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}