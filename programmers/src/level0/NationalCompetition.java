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
        for (Integer key: map.keySet()) {
            list.add(map.get(key));
        }
        int answer = (10000*list.get(0)) + (100*list.get(1)) + (list.get(2));
        return answer;
    }

    public static void main(String[] args) {
        int[] rank = {4,8,14,9,7,11,6,5,10,2,13,3,1,12};
        boolean[] attendance = {true, true, false, false,true, false, true,true, false, true, false,true,false, false};

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]){ //true 만 골라내기
                map.put(rank[i],i); // Map<등수,index>
            }
        }

        List<Integer> list1 = new ArrayList<>(map.keySet());
        Collections.sort(list1);

        List<Integer> list2 = new ArrayList<>();
        for (Integer key: list1) {
            // map 확인
            System.out.print("key : " + key + " , "); // list1
            System.out.println("velue : " + map.get(key)); // map
            
            //list2 추가
            list2.add(map.get(key));
        }

        // list 확인
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        int answer = (10000*list2.get(0)) + (100*list2.get(1)) + (list2.get(2));
        System.out.println(answer);

    }
}
