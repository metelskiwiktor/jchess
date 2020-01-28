package pl.wiktor.game.factory;

import pl.wiktor.game.field.Field;

public class Board {
    public static Board fillBoard(){
        Board board = new Board();
        for (char x = 'a'; x <= 'h'; x++ ){
            for(int y = 1; y <= 8; y++){
                Field field = new Field(x,y);

            }
        }
        return board;
    }
}
