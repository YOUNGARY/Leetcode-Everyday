class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();

        for (int i = left; i <= right; i++) {
            int num = i, tmp = 0, flag = 1;
            while (num != 0) {
                tmp = num % 10;
                if (tmp == 0) {
                    flag = 0;
                    break;
                }
                if (i % tmp != 0) {
                    flag = 0;
                    break;
                }
                num /= 10;
            }
            if (flag == 1) {
                ans.add(i);
            }
        }
        return ans;
    }
}