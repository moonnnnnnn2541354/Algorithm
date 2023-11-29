package level0;


public class DivisorAddition {

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                    continue;
                }
                if (i % j == 0) {
                    count += 2;
                }
            }
            answer = (count % 2 == 0) ? answer + i : answer - i;
        }
        return answer;
    }
}
