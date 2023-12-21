package level_1;

public class HarshadNumber {
    public boolean solution(int x) {
        String strNum = String.valueOf(x);
        int num = 0;
        for (int i = 0; i < strNum.length(); i++) {
            num += Integer.parseInt(strNum.substring(i,i+1));
        }

        boolean answer = (x%num == 0) ? true : false;
        return answer;
    }
}
