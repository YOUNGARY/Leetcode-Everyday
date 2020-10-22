class Solution {
    public String modifyString(String s) {
        if (s.length() == 1)
            return "a";
        StringBuffer ans = new StringBuffer();
        char[] c = s.toCharArray();
        int len = c.length;
        for (int i = 0; i < len; i++) {
            if (c[i] == '?') {
                char x = 'a';
                while (!isChangeable(c, x, i)) {
                    x++;
                }
                c[i] = x;
                ans.append(x);
            } else {
                ans.append(c[i]);
            }
        }
        return ans.toString();
    }

    private boolean isChangeable(char[] c, char x, int idx) {
        if (idx - 1 >= 0 && idx + 1 < c.length) {
            return c[idx + 1] != x && c[idx - 1] != x;
        } if (idx == 0) {
            return c[idx + 1] != x;
        } if (idx == c.length - 1) {
            return c[idx - 1] != x;
        }
        return false;
    }
}