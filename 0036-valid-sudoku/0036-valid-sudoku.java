class Solution {
    public boolean isValidSudoku(char[][] board) {
        @SuppressWarnings("unchecked")
        java.util.Set<Character>[] rows = new java.util.HashSet[9];
        @SuppressWarnings("unchecked")
        java.util.Set<Character>[] cols = new java.util.HashSet[9];
        @SuppressWarnings("unchecked")
        java.util.Set<Character>[] boxes = new java.util.HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new java.util.HashSet<>();
            cols[i] = new java.util.HashSet<>();
            boxes[i] = new java.util.HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue; // skip empty

                // row check
                if (!rows[r].add(ch)) return false;

                // col check
                if (!cols[c].add(ch)) return false;

                // box index: 0..8
                int b = (r / 3) * 3 + (c / 3);
                if (!boxes[b].add(ch)) return false;
            }
        }
        return true;
    }
}
