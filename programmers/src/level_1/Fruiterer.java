package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruiterer {

    public int solution(int k, int m, int[] score) {
        List<Integer> intList = new ArrayList<>();
        for (int i : score) {
            intList.add(i);
        }
        Collections.sort(intList);
        int answer = 0;
        List<Integer> serveList = new ArrayList<>();
        int index = intList.size() - 1;
        while (intList.size() >= m) {
            for (int i = 0; i < m; i++) {
                serveList.add(intList.get(index--));
                intList.remove(intList.size() - 1);
            }
            answer += (serveList.get(serveList.size() - 1) * m);
            serveList.clear();
        }
        return answer;
    }

}
