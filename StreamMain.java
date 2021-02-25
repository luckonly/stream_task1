package streams_task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,3,2,6,7,-8,0,7,9,5,2,55,890,33,4,-2);
        Stream intStream = list.stream().filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder());
        intStream.forEach(System.out::println);
    }
}
