package TaskFive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("Alfa", "Beta", "Gama");
        Stream<String> streamB = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(streamA, streamB);
        result.peek(System.out::println).collect(Collectors.toList());
    }


    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {
        List<T> collect = streamA.collect(Collectors.toList());
        List<T> collect1 = streamB.collect(Collectors.toList());

        int min = Math.min(collect.size(), collect1.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            result.add(collect.get(i));
            result.add(collect1.get(i));
        }
        return result.stream();
    }
}
