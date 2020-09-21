class Solution {
    public boolean isEven(int num) {
        int cnt = 0;
        while (num != 0) {
            cnt += 1;
            num /= 10;
        }
        return cnt % 2 == 0 ? true : false;
    }
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int n : nums) {
            if (isEven(n)) {
                cnt++;
            }
        }
        return cnt;
    }
}