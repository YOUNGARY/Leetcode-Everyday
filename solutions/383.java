class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphas = new int[26];
        for (char r : ransomNote.toCharArray()) {
            alphas[r - 'a']++;
        }
        for (char m :magazine.toCharArray()) {
            if (alphas[m - 'a'] > 0) {
                alphas[m - 'a']--;
            }
        }
        for (int a : alphas) {
            if (a > 0) {
                return false;
            }
        }
        return true;
    }
}