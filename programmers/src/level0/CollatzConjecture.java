package level0;

public class CollatzConjecture {
    public int solution(int num) {
        int answer = 0;
        long longNum = (long)num;
        while (longNum != 1) {
            if (answer > 500) {
                answer = -1;
                longNum = 1;
            } else if (longNum % 2 == 0) {
                longNum /= 2;
                answer++;
            } else if (longNum % 2 != 0) {
                longNum = (longNum * 3) + 1;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 626331;

        int answer = 0;
        long longNum = (long)num;

        while (longNum != 1) {
            if (answer > 500) {
                answer = -1;
                longNum = 1;
            } else if (longNum % 2 == 0) {
                longNum /= 2;
                answer++;
            } else if (longNum % 2 != 0) {
                longNum = (longNum * 3) + 1;
                answer++;
            }
        }
        System.out.println(answer);

    }

}
