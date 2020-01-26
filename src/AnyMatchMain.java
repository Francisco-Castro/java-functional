import java.util.List;

public class AnyMatchMain {

    public static void main(String[] args) {

        List<Integer> scores = List.of(10, 10, 9, 5, 6, 8);
        List<Integer> scores1 = List.of(10, 10, 9, 7, 6, 8);

        boolean b = scores.stream().anyMatch(score -> score < 6);
        boolean b1 = scores1.stream().anyMatch(score -> score < 6);

        System.out.println(b);
        System.out.println(b1);

    }
}
