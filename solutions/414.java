class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int n : nums) {
            first = Integer.max(n, first);
        }

        for (int n : nums) {
            if (!(n == first)) {
                second = Integer.max(n, second);
            }
        }
        
        boolean hasThird = false;
        for (int n : nums) {
            if (!(n == first || n == second)) {
                hasThird = true;
                third = Integer.max(n, third);
            }
        }
        if (!hasThird) {
            return first;
        }
        return third;
    }
}