package level_1;

import java.util.ArrayList;
import java.util.List;

public class Password {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        StringBuilder sbS = new StringBuilder(s);
        char[] charArr = skip.toCharArray();
        List<Character> listSkip = new ArrayList<>();
        for (char c : charArr) {
            listSkip.add(c);
        }

        for (int i = 0; i < sbS.length(); i++) {
            char c = sbS.charAt(i);
            for (int j = 0; j < index; j++) {
                c++;
                if (c > 122) {
                    c -= 26;
                }
                while (listSkip.contains(c)) {
                    if (listSkip.contains(c)) {
                        c++;
                    }
                    if (c > 122) {
                        c -= 26;
                    }
                }


            }
            answer.append(c);
        }
        return answer.toString();
    }
}
