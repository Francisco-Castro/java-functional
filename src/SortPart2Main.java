import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPart2Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Lord of the Rings", 150));
        books.add(new Book("Don Quijote de la Mancha", 500));
        books.add(new Book("Story of Two Cities", 200));
        books.add(new Book("Story of Two Cities", 200));
        books.add(new Book("El principito", 140));

        Comparator<Book> comparingCopies = Comparator.comparing(Book::getCopies);
        Comparator<Book> comparingTitle = Comparator.comparing(Book::getTitle);

        List<Book> collect = books.stream()
                .skip(2)
                .sorted(comparingCopies.reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
