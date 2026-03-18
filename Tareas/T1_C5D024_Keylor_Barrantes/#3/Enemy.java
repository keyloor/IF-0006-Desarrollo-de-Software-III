public class Enemy implements Attackable<Player> {
    private String name;

    public Enemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Player objective) {
        System.out.println("Enemy attacks player.");
    }

    @Override
    public String toString() {
        return "Enemy: " + name;
    }
}
