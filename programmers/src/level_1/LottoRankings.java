package level_1;

public class LottoRankings {

    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int sameCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    sameCount++;
                    continue;
                }
            }
        }
        int[] answer = {rank(sameCount + zeroCount), rank(sameCount)};
        return answer;
    }

    public static int rank(int count) {
        return switch (count) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }

}
