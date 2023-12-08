package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> intList = new ArrayList<>();
        for (int k : array) {
            intList.add(k);
        }
        List<Integer> intList2 = new ArrayList<>();
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                intList2.add(intList.get(j));
            }
            Collections.sort(intList2);
            System.out.println(intList2);
            answer[i] = intList2.get(commands[i][2] - 1);
            intList2.clear();
        }
        return answer;
    }
}
