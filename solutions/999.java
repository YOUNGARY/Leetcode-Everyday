class Solution {
    public int numRookCaptures(char[][] board) {
        int rowLen = board.length, colLen = board[0].length;
        int cnt = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (board[i][j] == 'R') {
                    // up
                    for (int k = i - 1; k >= 0; k--) {
                        if (board[k][j] == 'p') {
                            cnt++;
                            break;
                        } else if (board[k][j] != '.') {
                            break;
                        }
                    }

                    // down
                    for (int k = i + 1; k < rowLen; k++) {
                        if (board[k][j] == 'p') {
                            cnt++;
                            break;
                        } else if (board[k][j] != '.') {
                            break;
                        }
                    }

                    // left
                    for (int k = j - 1; k >= 0; k--) {
                        if (board[i][k] == 'p') {
                            cnt++;
                            break;
                        } else if (board[i][k] != '.') {
                            break;
                        }
                    }

                    // right
                    for (int k = j + 1; k < colLen; k++) {
                        if (board[i][k] == 'p') {
                            cnt++;
                            break;
                        } else if (board[i][k] != '.') {
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return cnt;
    }
}