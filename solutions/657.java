class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char m = moves.charAt(i);
            switch (m) {
                case 'U': y += 1;break;
                case 'D': y -= 1;break;
                case 'L': x -= 1;break;
                case 'R': x += 1;break;
                default:break;
            }
        }
        
        return (x == 0 && y == 0) ? true : false;
    }
}