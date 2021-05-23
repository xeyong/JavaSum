package demonstration.playerTest;

public class Player {
    private PlayerLevel playerLevel;

    public Player(){
        playerLevel = new Beginner();
    }
    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void play(int count){
        playerLevel.go(count);
    }
}
