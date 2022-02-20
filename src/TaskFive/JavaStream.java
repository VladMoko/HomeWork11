package TaskFive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Alfa", "Beta", "Gama");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(first, second);
        result.peek(System.out::println).collect(Collectors.toList());
    }


    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> collect = first.collect(Collectors.toList());
        List<T> collect1 = second.collect(Collectors.toList());

        int min = Math.min(collect.size(), collect1.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            result.add(collect.get(i));
            result.add(collect1.get(i));
        }
        return result.stream();
    }
}
