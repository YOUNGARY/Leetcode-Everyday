class Solution {
    public int countCharacters(String[] words, String chars) {
        int[][] alphabet = new int[26][2];
        for (char ch : chars.toCharArray()) {
            alphabet[ch - 'a'][0]++;
        }

        int cnt = 0;
        boolean isKnown = true;
        for (String word : words) {
            for (int j = 0; j < alphabet.length; j++) {
                alphabet[j][1] = 0;
            }
            isKnown = true;
            for (char ch : word.toCharArray()) {
                alphabet[ch - 'a'][1]++;
                if (alphabet[ch - 'a'][0] < alphabet[ch - 'a'][1]) {
                    isKnown = false;
                    break;
                }
            }
            if (isKnown) {
                cnt += word.length();
            }
        }

        return cnt;
    }
}