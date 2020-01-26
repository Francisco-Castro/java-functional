import java.util.ArrayList;
import java.util.List;

public class ReferenceMethodPart2Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("User 1", 11));
        users.add(new User("User 2", 22));
        users.add(new User("User 3", 33));
        users.add(new User("User 4", 44));

        users.stream()
                .map(User::getAge) // Reference method artbitrary form
                .forEach(System.out::println);

    }
}
