package level_1;

import java.util.Arrays;

public class ApplyMorePaint {

    public int solution(int n, int m, int[] section) {
        Arrays.sort(section);
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < section.length; j++) {
                if (section[j] == i) {
                    answer++;
                    i += m;
                }
            }
        }
        return answer;
    }
}
