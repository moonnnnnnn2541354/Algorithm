package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddTwoNumbers {

    public int[] solution(int[] numbers) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                intMap.put(numbers[i] + numbers[j], i);
            }
        }
        List<Integer> intList = new ArrayList<>(intMap.keySet());
        Collections.sort(intList);
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}
