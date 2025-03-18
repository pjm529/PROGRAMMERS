class Solution {
    public boolean solution(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n += arr[i]- '0';
        }
        
        if (x % n == 0) return true;
        return false;
    }
}