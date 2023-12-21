package level_0;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberExcept {
    // 짝수 제외시키기
    public int[] solution(int n) {
    List<Integer> intList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
        if (i % 2 != 0) {
            intList.add(i);
        }
    }
    int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
        answer[i] = intList.get(i);
    }
        return answer;
    }
}
