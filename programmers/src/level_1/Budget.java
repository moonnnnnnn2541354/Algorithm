package level_1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            money += d[i];
            if (money > budget) {
                answer = i;
                break;
            }
        }
        answer = (money <= budget) ? d.length : answer;
        return answer;
    }
}
