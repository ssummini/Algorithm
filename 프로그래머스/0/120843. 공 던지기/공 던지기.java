class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        
        idx = 2 * (k - 1);
        idx %= numbers.length;
        answer = numbers[idx];
        return answer;
    }
}