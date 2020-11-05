class Solution {
    public int maxPower(String s) {
        int l = 1, max = 1, len = s.length();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                l++;
            } else {
                l = 1;
            }
            max = Integer.max(l, max);
        }
        return max;
    }
}
