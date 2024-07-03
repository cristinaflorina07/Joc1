package bootstrap;

import design.DesignPlayer;
import player.Player;
import util.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bootstrap.MockDate.*;
import static util.Utils.generateId;

public class SetupGame {

    static List<Player> playerList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    static DesignPlayer designPlayer = new DesignPlayer();

    static Utils utils = new Utils();

    public static void addPlayer() {
        String choice = "";

        do {
            Player player = new Player();

            System.out.print("User name: ");
            String username = scanner.nextLine();
            System.out.print("Gen: ");
            String gen = scanner.nextLine();
            player.setUsername(username);
            player.setGen(gen);
            player.setId(generateId(min, max));
            player.setLevel(level);
            player.setHealth(health);
            player.setDamage(damage);
            player.setMana(mana);
            System.out.println(player);

            System.out.print("Do you want to add more player? y/n : ");
            choice = scanner.nextLine();
            playerList.add(player);

        } while (choice.equalsIgnoreCase("y"));
        if (choice.equalsIgnoreCase("n")) {
            gamePanel();
        }
    }


    public static void gamePanel() {
        System.out.println("1. Add Players");
        System.out.println("2. Show all players: ");
        System.out.println("3. PvP");
        System.out.print(": ");


        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        switch (chose) {
            case 1 -> addPlayer();
            case 2 -> utils.listAllPlayers(playerList);
            case 3 -> designPlayer.battle1V1(playerList);
            default -> System.out.println("Chose Options");
        }

    }
}
