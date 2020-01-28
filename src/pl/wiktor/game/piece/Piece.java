package pl.wiktor.game.piece;

import pl.wiktor.game.field.Field;
import pl.wiktor.game.move.Move;
import pl.wiktor.game.player.IPlayer;

public class Piece implements Bishop, King, Knight, Pawn, Queen, Row {
    private boolean alive;
    private IPlayer player;
    private Move move;

    public Piece(IPlayer player, Move move) {
        alive = true;
        this.player = player;
        this.move = move;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    public IPlayer getPlayer() {
        return player;
    }

    public Move getMove() {
        return move;
    }

    public boolean move(Field from, Field to){
        return move.move(from, to);
    }
}
