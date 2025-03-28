import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        for (int n : arr) {
            if (n < min) min = n;
        }

        for (int n : arr) {
            if (n != min) result.add(n);
        }

        return result.isEmpty() ? Collections.singletonList(-1) : result;
    }
}