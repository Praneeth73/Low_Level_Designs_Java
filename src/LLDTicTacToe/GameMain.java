package LLDTicTacToe;

public class GameMain {

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        System.out.println("Winner is " + ticTacToeGame.startGame());
    }
}
