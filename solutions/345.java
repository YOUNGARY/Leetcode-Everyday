class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        int start = 0, end = len - 1;
        char[] chars = s.toCharArray();
        while (start < end) {
            while (start < len && !isVowel(chars[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(chars[end])) {
                end--;
            }
            if (start >= end) {
                break;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }

    boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':return true;
            default:return false;
        }
    }
}