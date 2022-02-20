package taskTwo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedWords {

    public static void main(String[] args) {
        SortedWords sort = new SortedWords();
        sort.sortedString();
    }

    public void sortedString() {
        Stream<String> names = Stream.of("a","b","c","d","f")
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder());

        List<String> sortedNames = names.collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
