class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ch = new int[5];
        for (char c : text.toCharArray()) {
            switch (c - 'a') {
                case 'b' - 'a':ch[0]++;break;
                case 'a' - 'a':ch[1]++;break;
                case 'l' - 'a':ch[2]++;break;
                case 'o' - 'a':ch[3]++;break;
                case 'n' - 'a':ch[4]++;break;
            }
        }
        ch[2] /= 2;
        ch[3] /= 2;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (ch[i] < min) {
                min = ch[i];
            }
        }
        return min;
    }
}