package pl.wiktor.game.move;

import static java.lang.Math.abs;

public abstract class Moves {

    public static Move bishop() {
        return (from, to) -> {
            Check check = (x, y) -> abs(x) == abs(y);

            return new BuildCalculation()
                    .setCheck(check)
                    .move(from, to)
                    .bishopAndRow();
        };
    }

    public static Move row() {
        return (from, to) -> {
            Check check = (x, y) -> (x == 0 && y != 0) || (x != 0 && y == 0);

            return new BuildCalculation()
                    .setCheck(check)
                    .move(from, to)
                    .bishopAndRow();
        };
    }
}
