import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    UserService() {
        users = new ArrayList<>();
    }

    public void addUser(String name, String id, String email) {
        users.add(new User(name, id, email));
    }
}
