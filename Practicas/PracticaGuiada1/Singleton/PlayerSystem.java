public class PlayerSystem {
    private GameConfig config;
    private int lives;
    
    public PlayerSystem() {
        this.config = GameConfig.getInstance();
        this.lives = GameConfig.getInstance().getLives();
    }
    
    public GameConfig getConfig() {
        return config;
    }

    public void setConfig(GameConfig config) {
        this.config = config;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void show() {
        System.out.println("Lives: " + lives);
    }


}