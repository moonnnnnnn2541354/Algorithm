package level_1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) {
                cnt[0]++;
            }
            if (answers[i] == two[i % 8]) {
                cnt[1]++;
            }
            if (answers[i] == three[i % 10]) {
                cnt[2]++;
            }
        }

        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (max == cnt[i]) {
                numbers.add(i + 1);
            }
        }
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }

}
