package pl;

import pl.wiktor.Run;
import pl.wiktor.game.field.Field;
import pl.wiktor.game.move.Move;
import pl.wiktor.game.piece.Bishop;
import pl.wiktor.game.piece.IPiece;
import pl.wiktor.game.piece.Pawn;
import pl.wiktor.game.piece.Piece;
import pl.wiktor.game.player.Black;
import pl.wiktor.game.player.Player;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Application {
    public static void main(String[] args) {
        Run run = new pl.wiktor.console.Run();

        run.start();

        Pawn pawn = new Piece(new Player(), to -> false);
        Bishop bishop = new Piece(new Player(), to -> false);
//        move(pawn);
//        move(bishop);

        Player.move(from, to);

    }


    private static boolean checkField(Field field){
        return field.getX() == 'x' && field.getY() == 4;
    }


    public static void move(IPiece piece){
        System.out.println(piece.isAlive());
    }
}
