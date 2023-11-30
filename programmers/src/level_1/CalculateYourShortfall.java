package level_1;

public class CalculateYourShortfall {

    public long solution(int price, int money, int count) {
        long result = 0;
        for (int i = 0; i <= count; i++) {
            result += (price * i);
        }
        long answer = (result > money) ? result - money : 0;
        return answer;
    }

}
