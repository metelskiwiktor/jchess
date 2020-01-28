package pl.wiktor.game.move;

@FunctionalInterface
interface Check {
    boolean validCheck(int x, int y);
}
