package level_1;

public class GCDLCMCalculator {

    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int gcd = 0;
        for (int i = min; i >= 0; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        int lcm = (max * min) / gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
}
