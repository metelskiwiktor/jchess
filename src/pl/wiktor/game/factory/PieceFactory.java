package pl.wiktor.game.factory;

import pl.wiktor.game.piece.Piece;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PieceFactory {
    private Stack<Piece> pieces;

    public static Stack<Piece> fillPieces(){
        return null;
    }

    public static Set<Piece> pieces(){
        Set<Piece> pieces = new HashSet<>();
        for(int black_x = 1; black_x <= 8; black_x++){
            for(char black_y = 'a'; black_y < 'b'; black_y++){

            }
        }

        return pieces;
    }
}
