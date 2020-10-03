class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int I = 0, D = N;
        int[] ans = new int[N + 1];
        char[] ch = S.toCharArray();
        for (int i = 0; i < N; i++) {
            if (ch[i] == 'I') {
                ans[i] = I++;
            } else if (ch[i] == 'D') {
                ans[i] = D--;
            }
        }
        ans[N] = D;
        return ans;
    }
}