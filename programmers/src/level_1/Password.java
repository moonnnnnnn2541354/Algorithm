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

    public static void main(String[] args) {
        String s = "y";
        String skip = "abz";
        int index = 1;

        StringBuilder answer = new StringBuilder();


        for (char c : s.toCharArray()) {
            int idx = 0;
            while (idx < index) {
                c = c == 'z' ? 'a' : ++c;
                if (!skip.contains(String.valueOf(c))) {
                    ++idx;
                }
            }
            answer.append(c);
        }
        System.out.println(answer);

    }
}
