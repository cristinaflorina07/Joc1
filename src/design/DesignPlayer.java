package design;

import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.Color.*;

public class DesignPlayer {

    Scanner scanner = new Scanner(System.in);

    public void designPvP(List<Player> playerList) {
        for (Player player : playerList) {
            System.out.print("\tUsername: " + "[" + RED + player.getUsername() + RESET + "]" + RESET + " ");
            System.out.print("Health: " + "[" + RED + player.getHealth() + RESET + "]" + RESET + " ");
            System.out.print("Mana: " + "[" + RED + player.getMana() + RESET + "]" + RESET + " ");

            System.out.print("Level: " + "[" + BLUE + player.getLevel() + RESET + "]" + RESET);
        }
    }

    public List<Player> listPlayer(List<Player> playersList) {

        List<Player> emptyPlayers = new ArrayList<>();
        int index = 0;
        for (Player player : playersList) {
            emptyPlayers.add(player);
            System.out.println("[" + index + "]" + player);
            index++;
        }
        System.out.println("Select Players");
        int selector1 = scanner.nextInt();
        int selector2 = scanner.nextInt();


        getTwoItemsFromList(emptyPlayers, selector1,selector2);
        designPvP(emptyPlayers);

        return emptyPlayers;
    }

    public List<Player> getTwoItemsFromList(List<Player> list, int index1, int index2) {
        List<Player> emptyListPvP = new ArrayList<>();
        emptyListPvP.add(list.get(index1));
        emptyListPvP.add(list.get(index2));
        return emptyListPvP;
    }
}
