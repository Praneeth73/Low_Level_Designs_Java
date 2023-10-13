package LLDTicTacToe;

public class Board {

    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    // to display the board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();

        }

    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] == null) {
            board[row][col] = playingPiece;
            return true;
        }
        return false;
    }

    public boolean freeSpace() {
        boolean freespace = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freespace = true;
                    break;
                }
            }
        }
        return freespace;
    }
}

