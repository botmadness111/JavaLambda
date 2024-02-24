import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MySortInterface {
    List<Integer> sort(List<Integer> arr);
}

@FunctionalInterface
interface Executor {
    int execute(int x);
}

class Runner {
    public void run(Executor executor, int value) {
        int ans = executor.execute(value);
        System.out.println(ans);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(2, 1, 3, 5, 12, 6));

        MySortInterface mySortInterface = ((x) -> {
            Collections.sort(x);
            return x;
        });

        array = mySortInterface.sort(array);
        System.out.println(array);

//        ---------------------------------------------------------------------------

        Runner runner = new Runner();

        int value = 7;
        runner.run((x) -> x + 10, value);

        //        ---------------------------------------------------------------------------

        List<Integer> arr = new ArrayList<>(List.of(3, 2, 1));

//        arr.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        arr.sort((Integer x1, Integer x2) -> x2 - x1);

        System.out.println(arr);
    }
}