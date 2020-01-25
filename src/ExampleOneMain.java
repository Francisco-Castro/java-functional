import java.util.List;

public class ExampleOneMain {

    public static void main(String[] args) {
        // Obtain the elements > 10

        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        // Imperative approach
        int counter = 0;
        for (Integer i : numbers) {
            if (i > 10) counter++;
        }
        System.out.println(counter);

        // Declarative approach
        long count = numbers.stream().filter(num -> num > 10).count();
        System.out.println(count);

    }

}
