package bootstrap;

import player.Player;

import java.util.Scanner;

public class StarterSetup {
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

    public void menu() {
        System.out.println("1. Add Players");
        System.out.print(": ");
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        switch (chose) {
            case 1:
                StarterSetup generate = new StarterSetup();
                generate.generatePlayer();
                break;
            default:
                System.out.println("Chose Options");

        }
    }
}
