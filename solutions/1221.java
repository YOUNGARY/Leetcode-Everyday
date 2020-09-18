class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int it = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') it++;
            else it--;
            if (it == 0) ans++;
        }
        return ans;
    }
}