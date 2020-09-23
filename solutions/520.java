class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            // use charAt() is more proficient than toCharArray()
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                cnt++;
            }
        }
        return cnt == word.length() || (cnt ==  1 && word.charAt(0) >= 'A' && word.charAt(0) < 'Z') || cnt == 0;
    }
}