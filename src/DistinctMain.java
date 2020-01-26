import java.util.List;
import java.util.stream.Collectors;

public class DistinctMain {

    public static void main(String[] args) {

        List<String> names = List.of("User_1", "User_2", "User_3", "User_1", "User_2");

        List<String> collect = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
