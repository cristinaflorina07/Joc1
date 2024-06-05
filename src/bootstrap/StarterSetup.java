package bootstrap;

import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static bootstrap.Color.*;

public class StarterSetup {

    long min = 10000000000L;
    long max = 99999999999L;
    double level = 1;
    double damage = 10;
    double health = 100;
    double mana = 100;
    List<Player> playerList = new ArrayList<>();

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
        Scanner scanner = new Scanner(System.in);

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

    public void designColorPlayer(Player player) {
        System.out.println(RED + "Username" + RESET + player.getUsername());
        System.out.println(BLUE + "Level" + RESET + player.getLevel());


    }

    public Long generateId(long min, long max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        long range = max - min + 1;
        return min + (long) (random.nextDouble() * range);

    }

    public void showAllPlayers(List<Player> players) {
        for (Player player : players) {
            designColorPlayer(player);
        }
    }

    public void menu() {
        System.out.println("1. Add Players");
        System.out.println("2. Show all players: ");
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
            default:
                System.out.println("Chose Options");


        }

    }
}
