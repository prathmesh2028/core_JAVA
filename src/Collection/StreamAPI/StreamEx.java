package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> l = new ArrayList<>(size);
        Random ran = new Random();
        for(int i = 1 ; i <= size ; i++)
        {
            l.add(ran.nextInt(100));
        }
//        System.out.println(l);

        l.stream().map(n -> n*2);

        List<Integer> doubles = l.stream()
                        .map(n -> n*2)
                        .toList();
        int sum = l.stream()
                        .map(n -> n*2)
                        .reduce(0,(c,e) -> (c+e));

//        System.out.println(sum);

        long startSeq = System.currentTimeMillis();
        int sum2 = l.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = l.parallelStream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("para : " + (endPara - startPara));
    }
}
