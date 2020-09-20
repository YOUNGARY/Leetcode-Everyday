class Solution {
    public int maximum69Number (int num) {
        int[] pos = new int[5];
        int idx = 0;
        while (num != 0) {
            pos[idx++] = num % 10;
            num /= 10;
        }

        int ans = 0;
        boolean flag = false;
        for (int i = idx - 1; i >= 0; i--) {
            if (pos[i] == 6 && !flag) {
                ans = ans * 10 + 9;
                flag = true;
            } else {
                ans = ans * 10 + pos[i];
            }
        }
        return ans;
    }
}