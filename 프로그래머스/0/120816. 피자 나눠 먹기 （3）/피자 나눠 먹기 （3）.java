class Solution {
    public int solution(int slice, int n) {
        int count = 1;
        while (slice * count < n) {
            count++;
        }
        return count;
    }
}
