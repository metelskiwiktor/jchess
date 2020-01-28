package pl.wiktor.game.field;

public class Field {
    private char x;
    private int y;

    public Field(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
