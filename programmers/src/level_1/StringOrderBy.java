package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOrderBy {

    public String solution(String s) {
        char[] charArr = s.toCharArray();
        List<Integer> intList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            intList.add((int) charArr[i]);
        }
        Collections.sort(intList, Collections.reverseOrder());
        for (int i = 0; i < intList.size(); i++) {
            sb.append((char) (int) intList.get(i));
        }
        String answer = sb.toString();
        return answer;
    }

}
