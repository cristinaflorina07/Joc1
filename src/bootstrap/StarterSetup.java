package bootstrap;

import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.Utils.generateId;
import static util.Utils.showAllPlayers;

public class StarterSetup {

    long min = 10000000000L;
    long max = 99999999999L;
    double level = 1;
    double damage = 10;
    double health = 100;
    double mana = 100;
    List<Player> playerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Player generatePlayer() {
        Player player1 = new Player();
        player1.setUsername("Cristina");
        player1.setGen("Female");
        player1.setId(1L);
        player1.setLevel(1);
        player1.setDamage(10);
        player1.setHealth(100);
        player1.setMana(100);

        System.out.println(player1);
        return player1;
    }

    public void manualPlayer() {
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
            menu();
        }

    }


    public void menu() {
        System.out.println("1. Add Players");
        System.out.println("2. Show all players: ");
        System.out.println("3. PvP");
        System.out.print(": ");


        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        switch (chose) {
            case 1:
                manualPlayer();
                break;
            case 2:
                showAllPlayers(playerList);
                break;
            case 3:

            default:
                System.out.println("Chose Options");


        }

    }
}
