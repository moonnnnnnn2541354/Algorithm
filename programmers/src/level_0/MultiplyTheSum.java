package level_0;

import java.util.Arrays;

public class MultiplyTheSum {
    public int solution(int[] num_list) {
        int num = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            num *= num_list[i];
            sum += num_list[i];
        }

        int answer = (num > sum*sum) ? 0 : 1;
        return answer;
    }
}
