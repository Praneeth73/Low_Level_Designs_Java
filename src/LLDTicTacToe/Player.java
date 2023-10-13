package LLDTicTacToe;

public class Player {
    String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayerPiece() {
        return playingPiece;
    }

    public void setPlayerPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
