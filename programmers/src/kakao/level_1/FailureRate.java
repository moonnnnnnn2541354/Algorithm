package kakao.level_1;

import java.util.HashMap;
import java.util.Map;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int stage = 1;
        Map<Integer, Double> failureRate = new HashMap<>();
        while (stage <= N) {
            double total = 0;
            double fail = 0;
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] >= stage) {
                    total++;
                    fail = (stages[i] <= stage) ? fail + 1 : fail;
                }
            }
            failureRate.put(stage, (fail / total));
            stage++;
        }

        // Map 스트림
        // sorted -> 오름차순 정렬
        // Map.Entry.<Key타입, Value타입>comparingByValue() -> value지정
        // .reversed -> 역순 (오름차순의 역순 -> 내림차순)
        // mapToInt -> 해당값을 int로 변경
        // Map.Entry::getKey -> key지정
        // .toArray() -> map을 배열로 변경
        return failureRate.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
