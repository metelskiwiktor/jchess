package pl.wiktor.game.move;

public enum EnumMoves {
    BISHOP(FiguresCheck.bishop()),
    ROW(FiguresCheck.row()),
    KNIGHT(FiguresCheck.knight()),
    QUEEN(FiguresCheck.queen()),
    WHITE_PAWN(FiguresCheck.whitePawn()),
    BLACK_PAWN(FiguresCheck.blackPawn());

    private Check check;

    EnumMoves(Check check) {
        this.check = check;
    }
}
