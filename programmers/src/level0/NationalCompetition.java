package level0;

import java.util.*;

public class NationalCompetition {
    static class StudentList {
        int rank;
        int index;

        public StudentList (int rank, int index) {
            this.rank = rank;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};

        List<StudentList> studentList = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]){
                studentList.add(new StudentList(rank[i],i));
            }
        }

        Collections.sort(studentList, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList o1, StudentList o2) {
                return o1.rank - o2.rank ;
            }
        });

        for (StudentList rankList : studentList) {
            System.out.println(rankList.index);
        }

        int answer = 0;
        int num = 0;
        for (int i = 0; i < 3; i++) {
            answer = num + studentList.get(i).index; // 20403
            num = answer * 100; // 20400
        }
        System.out.println(answer);
    }

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
