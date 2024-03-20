package kakao.level_1;

public class DartsGame {
    public int solution(String dartResult) {
        String[] sArr = dartResult.split("");
        int[] answer = new int[3];
        int score = 0;
        int index = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].matches("[0-9]")) {
                score = Integer.parseInt(sArr[i]);
                if (sArr[i + 1].equals("0")) {
                    score = 10;
                    i++;
                }
            }
            else if (sArr[i].matches("[A-Z]")) {
                answer[index] = sArr[i].equals("S") ? score :
                        sArr[i].equals("D") ? score * score : score * score * score;
                index++;
            }
            else if (sArr[i].equals("*")) {
                answer[index - 1] *= 2;
                if (index - 1 > 0) {
                    answer[index - 2] *= 2;
                }

            }
            else if (sArr[i].equals("#")) {
                answer[index - 1] *= -1;
            }
        }
        return answer[0] + answer[1] + answer[2];
    }
}
