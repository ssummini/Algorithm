import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 1. 소문자 제거 (숫자만 남음)
        my_string = my_string.replaceAll("[a-z]", "");

        // 2. 배열 만들기
        int[] answer = new int[my_string.length()];

        // 3. 문자 → 숫자로 변환해서 배열에 넣기
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }

        // 4. 정렬
        Arrays.sort(answer);

        return answer;
    }
}
