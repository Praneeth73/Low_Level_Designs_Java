package LLDTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players = new LinkedList<>();
    Board gameBoard;

    public TicTacToeGame() {
        intializeGame();
    }

    private void intializeGame() {
        PlayingPiece playingPieceX = new PlayingPieceX();
        Player player1 = new Player("Praneeth", playingPieceX);
        PlayingPiece playingPieceY = new PlayingPieceO();
        Player player2 = new Player("Naga", playingPieceY);
        gameBoard = new Board(3);
        players.add(player1);
        players.add(player2);
    }

    public String startGame() {
        boolean winner = true;
        while (winner) {

            // Need to remove the first player from the player list
            Player player = players.removeFirst();
            gameBoard.printBoard();

            boolean freeSpace = gameBoard.freeSpace();

            if (!freeSpace) {
                winner = false;
                continue;
            }

            System.out.print("Player:" + player.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean addPieceSuccessful = gameBoard.addPiece(inputRow, inputColumn, player.playingPiece);

            if (!addPieceSuccessful) {
                System.out.println("Please provide the correct info : ");
                players.addFirst(player);
                continue;
            }

            // we will add the player to queue again for the rotation
            players.add(player);
            // check if there is any winner in the game
            boolean fianlWinner = isWinner(inputRow, inputColumn, player.playingPiece.pieceType);

            if (fianlWinner) {
                return player.name;
            }
        }
        return "tie";
    }

    public boolean isWinner(int inputRow, int inputColumn, PieceType pieceType) {

        boolean checkRow = true;
        boolean checkColumn = true;
        boolean checkDiagonal = true;
        boolean checkAntiDiagonal = true;

        // checking the row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != pieceType) {
                checkRow = false;
            }
        }

        // checking the column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][inputColumn] == null || gameBoard.board[i][inputColumn].pieceType != pieceType) {
                checkColumn = false;
            }
        }

        //need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                checkDiagonal = false;
            }
        }

        //need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                checkAntiDiagonal = false;
            }
        }


        return checkRow || checkColumn || checkDiagonal || checkAntiDiagonal;
    }


}
