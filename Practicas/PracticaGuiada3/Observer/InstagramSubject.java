
import java.util.ArrayList;
import java.util.List;

public class InstagramSubject implements Subject {

    private String state;
    private List<Observer> listObservers;

    public InstagramSubject() {
        listObservers = new ArrayList<>();
        state = "No hay videos";
    }

    @Override

    public void addObserver(Observer o) {
        if (o != null) {
            listObservers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        listObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("New state: " + state);
    }

    public void newReel(String state) {
        this.state = state;
        notifyObservers();
    }

}
