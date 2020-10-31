class Solution {
    public String convertToBase7(int num) {
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        StringBuilder res = new StringBuilder();
        do {
            res.append(num % 7);
            num /= 7;
        } while (num != 0);
        return (isNegative ? "-" : "") + res.reverse().toString();
    }
}