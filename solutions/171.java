class Solution {
    public int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + (ch[i] - 'A') + 1;
        }
        return sum;
    }
}