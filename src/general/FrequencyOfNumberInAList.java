package general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfNumberInAList {
    static <Integer> Map<Integer, Long> frequency(Stream<Integer> elements){
        return elements.collect(
                Collectors.groupingBy(
                        Function.identity(), HashMap::new,
                        Collectors.counting()
                )
        );
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4, 9);
        System.out.println(frequency(list.stream()));
    }
}
