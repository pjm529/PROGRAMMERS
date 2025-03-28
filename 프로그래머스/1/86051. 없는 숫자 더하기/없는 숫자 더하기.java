import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> numbersList = Arrays
            .stream(numbers)
            .boxed()
            .collect(Collectors.toList());
        
        return IntStream.range(0, 10)
            .filter(a -> !numbersList.contains(a))
            .sum();
    }
}