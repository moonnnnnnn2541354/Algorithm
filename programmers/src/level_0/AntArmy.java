package level_0;

public class AntArmy {
    public int solution(int hp) {
        int first = hp / 5; // 4
        int second = (hp % 5) / 3; // 1
        int third = second / 1; // 1
        int answer = first + second + third;
        return answer;
        // return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}

