import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
         int[] answer = Arrays.stream(arr)
                             .filter(num -> num % divisor == 0)
                             .sorted()
                             .toArray();

       return answer.length > 0 ? answer : new int[]{-1};
    }
}