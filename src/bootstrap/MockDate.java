package bootstrap;

import player.Player;

public class MockDate {
    static long min = 10000000000L;
    static long max = 99999999999L;
    static double level = 1;
    static double damage = 10;
    static double health = 100;
    static double mana = 100;

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

}
