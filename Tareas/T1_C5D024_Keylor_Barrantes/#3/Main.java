
public class Main {

    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");

        player.attack(enemy);
        enemy.attack(player);

        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
}
