import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ").append(index).append("에 있다");
        return sb.toString();
    }
}