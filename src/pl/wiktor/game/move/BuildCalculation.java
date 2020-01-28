package pl.wiktor.game.move;

import pl.wiktor.game.field.Field;

class BuildCalculation {
    private Check check = null;

    public BuildCalculation setCheck(Check check) {
        this.check = check;
        return this;
    }

    public Calculations move(Field from, Field to) {
        return new Calculations(check, from, to);
    }
}

