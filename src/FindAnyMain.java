import java.util.ArrayList;
import java.util.List;

public class FindAnyMain {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("User_1", 25));
        users.add(new User("User_2", 25));
        users.add(new User("User_3", 25));
        users.add(new User("User_4", 24));
        users.add(new User("User_5", 21));

        User user1 = users.stream()
                .filter(user -> user.getAge() == 21)
                .findAny() // .findFirst()
                .orElse(null);

        System.out.println(user1);

    }

}
