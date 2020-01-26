import java.util.ArrayList;
import java.util.List;

public class ImpVsDec {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("User_1", 25));
        users.add(new User("User_2", 20));
        users.add(new User("User_3", 15));
        users.add(new User("User_4", 24));
        users.add(new User("User_5", 21));

        // Imperative
        int counter = 0;
        for (User user : users) {
            if (user.getAge() > 18) {
                counter++;
            }
        }
        System.out.println(counter);


        // Declarative
        long count = users.stream()
                .peek(data -> System.out.println(data.toString()))
                .filter(user ->  user.getAge() > 18)
                .peek(data -> System.out.println(data.toString()))
                .count();
        System.out.println(count);

    }


}
