package level0;

import java.util.*;

public class NationalCompetition {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]){
                map.put(rank[i],i);
            }
        }
        List<Integer> list1 = new ArrayList<>(map.keySet());
        Collections.sort(list1);
        List<Integer> list = new ArrayList<>();
        for (Integer key: list1) {
            list.add(map.get(key));
        }
        int answer = (10000*list.get(0)) + (100*list.get(1)) + (list.get(2));
        return answer;
    }
}
