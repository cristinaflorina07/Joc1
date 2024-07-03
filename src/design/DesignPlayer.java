package design;

import bootstrap.SetupGame;
import player.Player;
import util.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bootstrap.SetupGame.scanner;
import static util.Color.*;

public class DesignPlayer {
    Utils utils = new Utils();

    public static void showInfoPlayer(List<Player> playerList) {
        for (Player player : playerList) {
            System.out.print("\tUsername: " + "[" + RED + player.getUsername() + RESET + "]" + RESET + " ");
            System.out.print("Health: " + "[" + RED + player.getHealth() + RESET + "]" + RESET + " ");
            System.out.print("Mana: " + "[" + RED + player.getMana() + RESET + "]" + RESET + " ");

            System.out.print("Level: " + "[" + BLUE + player.getLevel() + RESET + "]" + RESET);
        }
    }

    public List<Player> listPlayer(List<Player> playersList) {
        SetupGame setupGame = new SetupGame();
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


        utils.getTwoItemsFromList(emptyPlayers, selector1, selector2);
//        showInfoPlayer(emptyPlayers);
        setupGame.panelGame();
        return emptyPlayers;
    }


}
