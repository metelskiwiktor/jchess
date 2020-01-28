package pl.wiktor.game.move;

import pl.wiktor.game.field.Field;

class Calculations {
    private Check check;
    private int x;
    private int y;
    private Field to;
    private Field from;

    public Calculations(Field from, Field to) {
        setXAndYAndToAndFrom(from, to);
    }

    public Calculations(Check check, Field from, Field to) {
        this.check = check;
        setXAndYAndToAndFrom(from, to);
    }

    private void setXAndYAndToAndFrom(Field from, Field to) {
        this.x = from.getX() - to.getX();
        this.y = from.getY() - to.getY();
        this.to = to;
        this.from = from;
    }

    public boolean bishopAndRow() {

        if (!check.validCheck(x, y)) {
            return false;
        }

        for (int i = 1; i <= 8; i++) {
            char ix = (char) (i + from.getX());
            int iy = i + from.getY();

            if (checkField(new Field(ix, iy))) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkField(Field field) {
        return field.getX() == 'x' && field.getY() == 4;
    }
}