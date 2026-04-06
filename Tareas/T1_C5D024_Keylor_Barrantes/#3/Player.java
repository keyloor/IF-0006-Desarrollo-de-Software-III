public class Player implements Attackable<Enemy> {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Enemy objective) {
        System.out.println("Player attacks enemy.");
    }

    @Override
    public String toString() {
        return "Player: " + name;
    }
}
