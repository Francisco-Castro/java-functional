import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 6, 3, 1, 3, 5);

        List<Integer> collect = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
