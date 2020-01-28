package pl.wiktor.game.move;

import pl.wiktor.game.field.Field;

@FunctionalInterface
public interface Move {
    boolean move(Field from, Field to);
}
