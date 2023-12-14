package level_1;

public class _2016_Year {

    public String solution(int a, int b) {
        int[] listDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] start = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day = 0;

        String answer = "";
        for (int i = 0; i < a; i++) {
            day += listDay[i];
            if (i == a - 1) {
                day = ((day + b - listDay[i]-1) % 7 == 0) ? 7 : (day + b - listDay[i]) % 7;
                answer = start[day - 1];
            }
        }
        return answer;
    }

}
