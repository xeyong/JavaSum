package demonstration.playerTest;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.setPlayerLevel(new Advanced());
        player.play(3);
    }
}
