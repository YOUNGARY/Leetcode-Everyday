class Solution {
    public String addStrings(String num1, String num2) {
        int idx1 = num1.length() - 1, idx2 = num2.length() - 1;
        char[] c1 = num1.toCharArray(), c2 = num2.toCharArray();
        int add = 0;
        StringBuilder res = new StringBuilder();
        while (idx1 >= 0 && idx2 >= 0) {
            int n = c1[idx1--] - '0' + c2[idx2--] - '0' + add;
            add = n / 10;
            res.append(n % 10);
        }
        while (idx1 >= 0) {
            int n = c1[idx1--] - '0' + add;
            add = n / 10;
            res.append(n % 10);
        }
        while (idx2 >= 0) {
            int n = c2[idx2--] - '0' + add;
            add = n / 10;
            res.append(n % 10);
        }
        if (add == 1) {
            res.append(1);
        }

        return res.reverse().toString();
    }
}