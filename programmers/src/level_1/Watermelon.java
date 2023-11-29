package level_1;

public class Watermelon {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("수");
        for (int i = 1; i < n; i++) {
            sb.append((i%2==0)?"수":"박");
        }
        String answer = sb.toString();
        return answer;
    }
}
