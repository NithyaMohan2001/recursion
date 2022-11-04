class Solution {
    public List<String> findWords(char[][] board, String[] word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == word[row][col] && search(board, row, col, 0, word[row][col]))
                    return true;
            }
        }
        return false;
    }

    public boolean search(char[][] board, int row, int col, int index, char word[][]) {
        if (index == word.length())
            return true;
        if (word[i] == word[i + 1])
            return false;
        for (int i = 0; i < word.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                word[i] = word[i++];
                word.add(i);
                search(board, row, col, index, word[i]);
                word.remove(word.size() - 1);
            }
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word[row][col])
            return false;
        char current = board[row][col];
        board[row][col] = '-';
        boolean found = search(board, row + 1, col, index + 1, word) ||
                search(board, row, col + 1, index + 1, word) ||
                search(board, row - 1, col, index + 1, word) ||
                search(board, row, col - 1, index + 1, word);

        board[row][col] = current;
        return found;
    }
}
