public class Enemy implements Attackable<Player> {
    
    @Override
    public void attack(Player objective) {
        System.out.println("Enemy attacks player.");
    }
    
}
