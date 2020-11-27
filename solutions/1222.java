class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        int[][] board = new int[8][8];
        board[king[0]][king[1]] = 2;
        for (int[] queen : queens) {
            board[queen[0]][queen[1]] = 1;
        }
        List<List<Integer>> res = new LinkedList<>();
        for (int[] dir : direction) {
            List<Integer> list = getQueen(board, king, dir);
            if (null != list) {
                res.add(list);
            }
        }
        return res;
    }

    List<Integer> getQueen(int[][] board, int[] king, int[] dir) {
        int i = king[0];
        int j = king[1];
        while (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
            if (board[i][j] == 1) {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                list.add(j);
                return list;
            }
            i += dir[0];
            j += dir[1];
        }
        return null;
    }
}