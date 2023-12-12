package level_1;

public class FoodFightCompetition {

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = food.length - 1; i >= 1; i--) {
            if (food[i] % 2 != 0) {
                food[i] -= 1;
            }
            if (food[i] >= 2) {
                for (int j = 0; j < food[i]; j += 2) {
                    answer.insert(0, i);
                    answer.append(i);
                }
            }
        }
        if (food[0] == 1) {
            answer.insert(answer.length() / 2, 0);
        }
        return answer.toString();
    }

}
