package level_1;


public class CreatingPrimes {

    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    answer += isPrime(num)? 1 : 0;
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 나눠 떨어질 경우
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

