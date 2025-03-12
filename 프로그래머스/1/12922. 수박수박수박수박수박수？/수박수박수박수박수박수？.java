class Solution {
    public String solution(int n) {
        String[] strArr = new String[] {"수", "박"};
            
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int j = i % 2;
            sb.append(strArr[j]);
        }
        
        return sb.toString();
    }
}