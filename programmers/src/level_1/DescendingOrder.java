package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public long solution(long n) {
        String str = String.valueOf(n); // n -> String
        List<Integer> intList = new ArrayList<>(); // List 선언
        for (int i = 0; i < str.length(); i++) { // String 길이만큼 실행
            intList.add(Integer.parseInt(str.substring(i, i + 1))); // List에 추가
        }
        Collections.sort(intList, Collections.reverseOrder()); // 오름차순

        long answer = 0;
        for (int i = 0; i < intList.size(); i++) { // List만큼 실행
            answer = (answer + intList.get(i)) * 10;
        }
        answer /= 10;
        return answer;
    }
}
