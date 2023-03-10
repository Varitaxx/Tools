package eu.asgardschmiede.tools;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1,"Peter", "Parker"));
        users.add(new User(2,"Bruce", "Banner"));
        users.add(new User(3,"Carol", "Danvers"));
    }

}
