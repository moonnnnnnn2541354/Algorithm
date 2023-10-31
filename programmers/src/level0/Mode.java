package level0;

import java.util.Arrays;

public class Mode {
    public int solution(int[] array) {
        int answer = 0;
        int[] intArr = new int[1001];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            intArr[num] +=1;
        }

        Arrays.sort(intArr);
        if (intArr[1000] == intArr[999]){
            answer = -1;
        } else {
            answer = intArr[1000];
        }
        return answer;
    }
}
