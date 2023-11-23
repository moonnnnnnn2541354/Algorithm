package level0;

import java.util.HashMap;
import java.util.Map;

public class ClosestSameLetter {
    public int[] solution(String s) {
        char[] charArr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int[] answer = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            if (!map.containsKey(charArr[i])){
                answer[i] = -1;
                map.put(charArr[i],i);
                continue;
            }
            if (map.containsKey(charArr[i])) {
                answer[i] = i-map.get(charArr[i]);
                map.put(charArr[i],i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        char[] charArr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int[] answer = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            if (!map.containsKey(charArr[i])){
                answer[i] = -1;
                map.put(charArr[i],i);
                continue;
            }
            if (map.containsKey(charArr[i])) {
                answer[i] = i-map.get(charArr[i]);
                map.put(charArr[i],i);
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

}
