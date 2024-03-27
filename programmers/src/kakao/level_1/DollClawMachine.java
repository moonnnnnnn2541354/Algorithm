package kakao.level_1;

import java.util.Stack;

public class DollClawMachine {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int column;
        int row;
        int count = 0;
        for (int i = 0; i < moves.length; i++) {
            column = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                row = j;
                if (board[row][column] > 0) {
                    if (!stack.isEmpty() && stack.peek() == board[row][column]) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.add(board[row][column]);
                    }
                    board[row][column] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
