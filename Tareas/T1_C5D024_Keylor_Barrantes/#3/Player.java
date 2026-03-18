public class Player implements Attackable<Enemy> {

    @Override
    public void attack(Enemy objective) {
       System.out.println("Player attacks enemy.");
    }
    
}
