import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 1, 3, 5, 7, 1));

        list = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        set = set.stream().map(x -> x * 3).collect(Collectors.toSet());
        System.out.println(set);

        list = list.stream().filter(x -> x >= 10).collect(Collectors.toList());
        System.out.println(list);

//        list.forEach(System.out::println);

        System.out.println( list.stream().reduce((x, y) -> x+y).get());

    }
}