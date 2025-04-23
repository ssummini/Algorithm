import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";

        // 1. 모스 부호 Map 만들기
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put(".-", "a"); morseMap.put("-...", "b"); morseMap.put("-.-.", "c");
        morseMap.put("-..", "d"); morseMap.put(".", "e"); morseMap.put("..-.", "f");
        morseMap.put("--.", "g"); morseMap.put("....", "h"); morseMap.put("..", "i");
        morseMap.put(".---", "j"); morseMap.put("-.-", "k"); morseMap.put(".-..", "l");
        morseMap.put("--", "m"); morseMap.put("-.", "n"); morseMap.put("---", "o");
        morseMap.put(".--.", "p"); morseMap.put("--.-", "q"); morseMap.put(".-.", "r");
        morseMap.put("...", "s"); morseMap.put("-", "t"); morseMap.put("..-", "u");
        morseMap.put("...-", "v"); morseMap.put(".--", "w"); morseMap.put("-..-", "x");
        morseMap.put("-.--", "y"); morseMap.put("--..", "z");

        // 2. 공백 기준으로 나누기
        String[] morseArr = letter.split(" ");

        // 3. 모스 부호 하나씩 해석해서 붙이기
        for(String code : morseArr){
            answer += morseMap.get(code);
        }
        return answer;
    }
}
