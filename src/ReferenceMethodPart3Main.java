import java.util.ArrayList;
import java.util.List;

public class ReferenceMethodPart3Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        IUser iUser = User::new;

        User user1 = iUser.create("User 1", 1);
        User user2 = iUser.create("User 2", 2);
        User user3 = iUser.create("User 3", 3);
        User user4 = iUser.create("User 4", 4);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        users.stream()
                .map(User::getName) // Reference method arbitrary form
                .forEach(System.out::println);

    }

}
