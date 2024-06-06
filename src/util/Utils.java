package util;

import design.DesignPlayer;
import player.Player;

import java.util.List;
import java.util.Random;

public class Utils {
    static DesignPlayer designPlayer = new DesignPlayer();
    public static void showAllPlayers(List<Player> players) {
        for (Player player : players) {
            designPlayer.designPvP(player);
        }
    }
    public static Long generateId(long min, long max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        long range = max - min + 1;
        return min + (long) (random.nextDouble() * range);

    }
}
