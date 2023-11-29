package level_1;

public class SmallSubstring {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            answer =
                (Long.parseLong(p) >= Long.parseLong(t.substring(i, i + p.length()))) ? answer + 1 : answer;
        }
        return answer;
    }
}
