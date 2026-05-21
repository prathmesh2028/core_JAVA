package Collection.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 2);

        // Fresh stream every time
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println("s1 : " + n));

        System.out.println();

        // New stream again
        Stream<Integer> s2 = nums.stream()
                .filter(n -> n % 2 == 0);

        s2.forEach(n -> System.out.println("s2 : " + n));

        System.out.println();

        // New stream again
        Stream<Integer> s3 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2);

        s3.forEach(n -> System.out.println("s3 : " + n));

        Predicate<Integer> p = i -> i % 2 == 0;
        // as predicate is a functional interface

        Function<Integer , Integer> fun = i -> i*2;

        int result = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0,(c,e) -> c+e);
        System.out.println(result);
    }
}