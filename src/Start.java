import bootstrap.SetupGame;
import design.DesignPlayer;

import java.util.Scanner;

public class Start {
    public static void main(String... args) {
        SetupGame generator = new SetupGame();
        DesignPlayer designPlayer = new DesignPlayer();
        generator.panelGame();


        // List<Player> playerList = new ArrayList<>(List.of(

        // new Player(1L, "sdada", 1, "M", 100, 100, 10),
        //   new Player(2L, "qwe", 1, "M", 100, 100, 10)));
        // designPlayer.listPlayer(playerList);
    }
}
