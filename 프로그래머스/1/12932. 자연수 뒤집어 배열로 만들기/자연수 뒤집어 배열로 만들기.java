import java.util.*;

class Solution {
    public Integer[] solution(long n) {
        
        String nStr = String.valueOf(n);
        Integer[] arr = new Integer[nStr.length()];
        
        for (int i = 0; i < nStr.length(); i++) {
           arr[i] = Integer.valueOf(nStr.substring(i, i+1));
        }
        
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray(new Integer[nStr.length()]);
    }
}