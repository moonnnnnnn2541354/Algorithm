package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        // 배열 -> List 변환
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            lostList.add(i);
        }

        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }

        // 오름차순
        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 여벌옷 받은 사람 수
        int cnt = 0;

        // lost , reserve 같은 중복되는 수 삭제
        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)) {
                    lostList.set(i, -1);
                    reserveList.set(j, -1);
                    cnt++;
                }
            }
        }

        // 여벌옷 받을수 있는 수 찾기
        for (int i = 0; i < lostList.size(); i++) {
            if (lostList.get(i) != -1) {
                for (int j = 0; j < reserveList.size(); j++) {
                    if (reserveList.get(j) != -1) {
                        if (lostList.get(i) >= reserveList.get(j) - 1 &&
                                lostList.get(i) <= reserveList.get(j) + 1) {
                            lostList.set(i, -1);
                            reserveList.set(j, -1);
                            cnt++;
                        }
                    }
                }
            }
        }

        return n - lostList.size() + cnt;
    }
}
