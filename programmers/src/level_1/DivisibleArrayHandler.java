package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisibleArrayHandler {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                intList.add(arr[i]);
            }
        }
        if (intList.isEmpty()){
            intList.add(-1);
        }
        Collections.sort(intList);
        int[] answer = new int[intList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                intList.add(arr[i]);
            }
        }
        if (intList.isEmpty()){
            intList.add(-1);
        }
        Collections.sort(intList);
        int[] answer = new int[intList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = intList.get(i);
        }
    }

}
