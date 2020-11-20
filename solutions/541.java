class Solution {
    public String reverseStr(String s, int k) {
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        for (; i + 2 * k <= len; i += 2 * k) {
            String sub1 = s.substring(i, i + k);
            String sub2 = s.substring(i + k, i + 2 * k);
            for (int j = k - 1; j >= 0; j--) {
                ans.append(sub1.charAt(j));
            }
            for (int j = 0; j < k; j++) {
                ans.append(sub2.charAt(j));
            }
        }
        if (len - i < k) {
            for (int j = len - 1; j >= i; j--) {
                ans.append(s.charAt(j));
            }
        } else {
            int end = i + k;
            for (int j = end - 1; j >= i; j--) {
                ans.append(s.charAt(j));
            }
            for (int j = end; j < len; j++) {
                ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }
}
