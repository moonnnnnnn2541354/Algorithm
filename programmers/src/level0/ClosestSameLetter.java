package level0;

import java.util.HashMap;
import java.util.Map;

public class ClosestSameLetter {
    public int[] solution(String s) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";

        System.out.println(s.indexOf(3));
        char[] charArr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int[] intArr = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            if (!map.keySet().equals(charArr[i])){
                intArr[i] = -1;
                continue;
            }
//            if (map.keySet().equals(charArr[i])) {
//                map.put(charArr[i],)
//            }
        }

    }

}
