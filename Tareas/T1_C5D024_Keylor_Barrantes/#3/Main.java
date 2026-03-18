public class Main {
    public static void main(String[] args) {
        Player player = new Player("Heroe");
        Enemy enemy = new Enemy("Duende");

        player.attack(enemy);
        enemy.attack(player);

        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
}
