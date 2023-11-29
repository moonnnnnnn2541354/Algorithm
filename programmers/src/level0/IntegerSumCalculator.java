package level0;


public class IntegerSumCalculator {

    public long solution(int a, int b) {
        int maxNum = (a > b) ? a : b;
        int minNum = (a < b) ? a : b;
        long answer = 0;
        for (int i = minNum; i <= maxNum; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int maxNum = (a > b) ? a : b;
        int minNum = (a < b) ? a : b;
        long answer = 0;

        System.out.println(maxNum);
        System.out.println(minNum);

        for (int i = minNum; i <= maxNum; i++) {
            answer += i;
        }
        System.out.println(answer);
    }

}
