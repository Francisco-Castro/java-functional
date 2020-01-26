import java.util.List;

public class ReferenceMethodsMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        // Static Method
//        numbers.stream()
//                .map(ReferenceMethodsMain::toCube)
//                .forEach(System.out::println);

        // Instance of a Class
        Calculator calculator = new Calculator();

        numbers.stream()
                .map(calculator::toCube)
                .forEach(System.out::println);

    }

    public static int toCube(int number) {
        return number * number * number;
    }

}
