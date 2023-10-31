package level0;

import java.util.Arrays;

public class Mode {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;

        // 카운트배열 선언&생성
        int[] countArr = new int[1001];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            countArr[num] += 1;
        }

        // 최빈값 위치 찾기
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                answer = i;
            }
        }

        // 최빈값이 몇가지가 있는지 확인
        int count = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (max == countArr[i]) {
                count++;
            }
        }

        // 최빈값이 2개 이상이면 answer = -1
        if (count > 1) {
            answer = -1;
        }

        return answer;
    }
}
