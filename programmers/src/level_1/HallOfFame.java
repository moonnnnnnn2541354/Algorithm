package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                intList.add(score[i]);
            }
            if (i >= k) {
                if (score[i] > intList.get(0)) {
                    intList.add(score[i]);
                }
            }
            Collections.sort(intList);
            if (intList.size() > k) {
                intList.remove(0);
            }
            answer[i] = intList.get(0);
        }
        return answer;
    }

}
