package TaskFour;

import java.util.stream.Stream;

public class RandomNumbers {

    public static void main(String[] args) {
        RandomNumbers numbers = new RandomNumbers();
        numbers.numbers(0L,22L,(long)Math.pow(3,43))
                .limit(10)
                .peek(System.out::println)
                .count();
    }

    public Stream<Long> numbers(long seed, long c, long m) {
        long a = 1233143552L;
        return Stream.iterate(seed, x -> ((a * x + c) % m));
    }
}
