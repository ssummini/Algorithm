class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        
        if (sqrt == (int)sqrt) {
            return 1; // 제곱수임
        } else {
            return 2; // 제곱수 아님
        }
    }
}
