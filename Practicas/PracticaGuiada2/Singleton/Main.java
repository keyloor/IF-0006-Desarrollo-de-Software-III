public class Main {
    public static void main(String[] args) {
        GameConfig config = GameConfig.getInstance();
        config.setEnemySpeed(100);
        config.setLives(10);

        EnemySystem enemySystem = new EnemySystem();
        PlayerSystem playerSystem = new PlayerSystem();

        enemySystem.show();
        playerSystem.show();
    }
}