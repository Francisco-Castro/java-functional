import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMain {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("User_1a", "User_2a");
        List<String> list2 = Arrays.asList("User_1b", "User_2b");
        List<String> list3 = Arrays.asList("User_1c", "User_2c");

        List<String> collect = Stream.of(list1, list2, list3)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(collect);

    }




}
