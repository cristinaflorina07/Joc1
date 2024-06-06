package design;

import player.Player;

import java.util.ArrayList;
import java.util.List;

import static util.Color.*;

public class DesignPlayer {
    public void designPvP(Player player) {
        System.out.print("\tUsername: " + "[" + RED + player.getUsername() + RESET + "]" + RESET + " ");
        System.out.print("Health: " + "[" + RED + player.getHealth() + RESET + "]" + RESET + " ");
        System.out.print("Mana: " + "[" + RED + player.getMana() + RESET + "]" + RESET + " ");

        System.out.print("Level: " + "[" + BLUE + player.getLevel() + RESET + "]" + RESET);
    }
    public List<Player> listPlayer(List<Player> playersList){
        List<Player> emptyPlayers = new ArrayList<>();
        int index = 0;
        for (Player player: playersList) {
            emptyPlayers.add(player);
            System.out.println("[" + index + "]" + player);
            index++;
        }

        return emptyPlayers;
    }
}
