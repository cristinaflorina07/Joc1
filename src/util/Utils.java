package util;

import bootstrap.SetupGame;
import design.DesignPlayer;
import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static bootstrap.SetupGame.gamePanel;
import static design.DesignPlayer.showInfoPlayer;


public class Utils {
    static SetupGame generator = new SetupGame();

    static DesignPlayer designPlayer = new DesignPlayer();

    public void listAllPlayers(List<Player> players) {
        showInfoPlayer(players);
        gamePanel();
    }

    public static Long generateId(long min, long max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        long range = max - min + 1;
        return min + (long) (random.nextDouble() * range);

    }
    public List<Player> getTwoItemsFromList(List<Player> list, int index1, int index2) {
        List<Player> emptyListPvP = new ArrayList<>();
        emptyListPvP.add(list.get(index1));
        emptyListPvP.add(list.get(index2));
        showInfoPlayer(emptyListPvP);
        return emptyListPvP;
    }
}
