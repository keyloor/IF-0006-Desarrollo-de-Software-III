public class EnemySystem {
    private GameConfig config;
    private int speed;

    public EnemySystem() {
        this.config = GameConfig.getInstance();
        this.speed = GameConfig.getInstance().getEnemySpeed();
    }

    public GameConfig getConfig() {
        return config;
    }

    public void setConfig(GameConfig config) {
        this.config = config;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void show() {
        System.out.println("Speed: " + speed);
    }

}