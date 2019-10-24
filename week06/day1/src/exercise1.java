import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise1 {
  List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
  List<Integer> evens = numbers.stream()
      .filter(s-> s%2==0)
      .collect(Collectors.toList());

}
