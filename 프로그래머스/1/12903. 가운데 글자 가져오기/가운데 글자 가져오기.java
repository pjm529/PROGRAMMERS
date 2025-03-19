class Solution {
    public String solution(String s) {
        int sLength = s.length();
        
        if (sLength % 2 == 0) {
            return s.substring(sLength / 2 - 1, sLength / 2 + 1);
        }
        
        return s.substring(sLength / 2, sLength / 2 + 1);
    }
}