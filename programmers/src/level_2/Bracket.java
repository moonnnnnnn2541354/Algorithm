package level_2;

public class Bracket {
    boolean solution(String s) {
        char[] chaArr = s.toCharArray();
        int cnt = 0;

        for (char c : chaArr) {
            cnt = (c == '(') ? cnt + 1 : cnt - 1;
            if (cnt < 0) {
                return false;
            }
        }
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()()";

        char[] chaArr = s.toCharArray();
        boolean answer;

        int cnt = 0;
        for (char c : chaArr) {
            cnt = (c == '(') ? cnt + 1 : cnt - 1;
            if (cnt < 0) {
                answer = false;
            }
        }
        if (cnt == 0) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);

    }
}
