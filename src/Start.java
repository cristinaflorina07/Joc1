import bootstrap.StarterSetup;
import design.DesignPlayer;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String... args) {
        StarterSetup generator = new StarterSetup();
        DesignPlayer designPlayer = new DesignPlayer();
//        generator.menu();

        List<Player> playerList = new ArrayList<>(List.of(

                new Player(1L, "sdada", 1, "M", 100, 100, 10),
                new Player(2L, "qwe", 1, "M", 100, 100, 10)));
        designPlayer.listPlayer(playerList);
    }
}
