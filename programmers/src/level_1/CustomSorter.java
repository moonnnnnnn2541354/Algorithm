package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSorter {

    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }

}
