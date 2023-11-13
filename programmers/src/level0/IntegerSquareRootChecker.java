package level0;

public class IntegerSquareRootChecker {
    public static long solution(long n) {
        long answer = 0;
        long num = 0;

        while (answer == 0){
            if (num*num == n) {
                answer = (num+1)*(num+1);
                break;
            } else if (num*num > n) {
                answer = -1;
                break;
            } else if (num*num != n) {
                num++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 3;
        System.out.println(solution(n));
    }
}
