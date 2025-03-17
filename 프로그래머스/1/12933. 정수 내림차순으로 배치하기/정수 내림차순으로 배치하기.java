import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        String result = String.valueOf(n)
                .chars()                                  
                .mapToObj(c -> String.valueOf((char) c))    
                .sorted(Comparator.reverseOrder())         
                .collect(Collectors.joining());           
        
        return Long.parseLong(result);
    }
}
