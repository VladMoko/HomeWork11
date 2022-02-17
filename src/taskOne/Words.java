package taskOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {
    public static void main(String[] args) {
        Words person = new Words();
        person.filter();
    }
    public void filter(){
        Stream<String> names = Arrays.asList("1. Viva", "2. Vlad" ,"3. Nadia", "4. Saliva")
                .stream()
                .filter(name -> (Integer.parseInt(String.valueOf(name.charAt(0))))% 2 != 0)
                .sorted();
        List<String> filterList = names.collect(Collectors.toList());
        System.out.println(filterList);
    }
}