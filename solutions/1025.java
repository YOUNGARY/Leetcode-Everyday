class Solution {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}

// N = 1, B win
// N = 2, [1, 1] A win
// N = 3, [1, 2] [1, 1] [2, 1] B win
// N = 4, [1, 3] [1, 2] [1, 1] A win
//        [2, 2] [1, 1] B win