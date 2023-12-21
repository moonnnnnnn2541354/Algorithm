package level_0;

public class IceAmericano {
    public int[] solution(int money) {
        int[] answer = {(money / 5500),(money % 5500)};
        return answer;
    }
}
