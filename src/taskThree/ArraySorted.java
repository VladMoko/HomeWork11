package taskThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorted {

    public static void main(String[] args) {
        ArraySorted sorted = new ArraySorted();
        sorted.numbersInArray();
    }

    private static final String[] str = {"1,2,0", "3,4"};

    public void numbersInArray() {
        String result = getNumbers().stream()
                .map(element -> (List<String>) new ArrayList<>(Arrays.asList(element.replaceAll("\\D+", " ").split(" "))))
                .flatMap(Collection::stream)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(x -> x + "")
                .collect(Collectors.joining(", ", "\"", "\""));
        System.out.println(result);
    }

    private static List<String> getNumbers() {
        return Arrays.asList(ArraySorted.str);
    }
}
