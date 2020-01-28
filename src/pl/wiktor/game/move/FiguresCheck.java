package pl.wiktor.game.move;

import static java.lang.Math.abs;

public final class FiguresCheck {
    private FiguresCheck() {
    }

    public static Check bishop(){
        return (x, y) -> abs(x) == abs(y);
    }

    public static Check row(){
        return (x, y) -> (x == 0 && y != 0) || (x != 0 && y == 0);
    }

    public static Check knight(){
        return (x, y) -> (abs(x) == 1 && abs(y) == 2 ) || (abs(x) == 2 && abs(y) == 1);
    }

    public static Check queen(){
        return (x, y) -> (abs(x) == abs(y)) || (x == 0 && y != 0) || (x != 0 && y == 0);
    }

    public static Check whitePawn(){
        return (x, y) -> ((abs(x) == 0 || abs(x) == 1 ) && y == 1);
    }

    public static Check blackPawn(){
        return (x, y) -> ((abs(x) == 0 || abs(x) == 1 ) && y == -1);
    }
}
