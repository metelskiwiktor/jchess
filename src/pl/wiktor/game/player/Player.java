package pl.wiktor.game.player;

public class Player implements Black, White {
    private boolean alive = true;
    
    public boolean isAlive() {
        return alive;
    }

    public void dead(){
        alive = false;
    }
}
