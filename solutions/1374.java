class Solution {
    public String generateTheString(int n) {
        StringBuilder ans = new StringBuilder();
        if (n % 2 == 0) {
            ans.append("a");
        }
        for (int i = 0; i < n - 1 +  n % 2; i++) {
            ans.append("b");
        }
        return ans.toString();
    }
}