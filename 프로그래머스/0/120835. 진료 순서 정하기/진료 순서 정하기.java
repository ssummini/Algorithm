import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy); // 오름차순 정렬

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (emergency[i] == copy[j]) {
                    answer[i] = copy.length - j; // 순위 계산
                    break;
                }
            }
        }

        return answer;
    }
}
