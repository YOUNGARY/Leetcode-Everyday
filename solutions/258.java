class Solution {
    public int addDigits(int num) {
        int res = num;
        while (true) {
            res = digitsSum(res);
            if (res % 10 == res) {
                break;
            }
        }
        return res;
    }

    int digitsSum(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}